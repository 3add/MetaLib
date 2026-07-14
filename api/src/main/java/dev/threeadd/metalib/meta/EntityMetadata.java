package dev.threeadd.metalib.meta;

import com.github.retrooper.packetevents.protocol.entity.data.EntityData;
import com.github.retrooper.packetevents.protocol.entity.data.EntityMetadataProvider;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMetadata;
import dev.threeadd.metalib.meta.property.MetadataProperty;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.MetadataView;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A version-agnostic data store for <a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata">entity metadata</a>
 */
public class EntityMetadata implements EntityMetadataProvider {

    private final MetadataSchema schema;
    private final Map<MetadataProperty<?>, Object> metadata = new ConcurrentHashMap<>();
    private final Map<ViewProperty<?, ?>, Object> views = new ConcurrentHashMap<>();

    /**
     * Create a new metadata store instance
     *
     * @param schema the {@link MetadataSchema}, you can create your own,
     *               MetaLib's ensures there are no duplicate indices for one entity type
     * @throws NullPointerException if the provided {@code schema} is null
     */
    public EntityMetadata(MetadataSchema schema) {
        this.schema = Objects.requireNonNull(schema, "schema cannot be null");
    }

    /**
     * Create a new metadata store instance
     *
     * @param type the {@link EntityType} to use the default schema for
     * @throws NullPointerException if the provided {@code type} is null
     */
    public EntityMetadata(EntityType type) {
        this(MetadataSchemaRegistry.getSchema(Objects.requireNonNull(type, "type cannot be null")));
    }

    /**
     * Clears all stored data
     *
     * @return this meta for chaining
     */
    public EntityMetadata clear() {
        this.metadata.clear();
        this.views.clear();
        return this;
    }

    /**
     * @return the schema this meta holds
     */
    public MetadataSchema getSchema() {
        return this.schema;
    }

    /**
     * Stores a value for a simple (non-wrapped) metadata property.
     *
     * @param property the simple property to set
     * @param <T>      the type of the property
     * @param value    the new value
     * @return this entity meta for chaining
     */
    public <T> EntityMetadata set(SimpleProperty<T> property, @Nullable T value) {
        return this.setRaw(property, value);
    }

    /**
     * @param property the simple property to get
     * @param <T>      the type of the property
     * @return the current value of a simple metadata property, or {@code null}
     * if the property has not been set.
     */
    public <T> @Nullable T get(SimpleProperty<T> property) {
        return this.getRaw(property);
    }

    /**
     * @param property the simple property to get
     * @param <T>      the type of the property
     * @return the current value of a simple metadata property, or {@code null}
     * if the property has not been set.
     */
    @SuppressWarnings("unchecked")
    public <T> Optional<T> getOptional(SimpleProperty<T> property) {
        return Optional.ofNullable((T) this.metadata.get(property));
    }

    /**
     * @param property the view property to get
     * @param <V>      the type of the view
     * @param <T>      the type of the underlying value
     * @return the {@link MetadataView} for a view property.
     *
     * <p>The view itself reads from and writes to this
     * store, so no separate "set" call is needed, mutate the view directly.
     */
    @SuppressWarnings({"unchecked"})
    public <T, V extends MetadataView<T>> V get(ViewProperty<T, V> property) {
        return (V) this.views.computeIfAbsent(property, k -> property.createView(this));
    }

    /**
     * @param property the property to check for
     * @return {@code true} if this store has a value for the given property
     */
    public boolean has(MetadataProperty<?> property) {
        return this.metadata.containsKey(property);
    }

    /**
     * Stores a raw value for any property.
     * {@link #set(SimpleProperty, Object)} or the {@link ViewProperty} setters should be by api users.
     *
     * @param property the property to set
     * @param value    the value to set, or {@code null} to remove the property
     * @param <R>      the type of the property
     * @return this meta for chaining
     */
    @ApiStatus.Internal
    public <R> EntityMetadata setRaw(MetadataProperty<R> property, @Nullable R value) {
        if (value == null) {
            this.metadata.remove(property);
            return this;
        }

        if (!this.schema.contains(property)) {
            throw new IllegalArgumentException(String.format(
                    "Property '%s' is not valid for entity type: %s", property, this.schema.getBoundEntityType()
            ));
        }

        this.metadata.put(property, value);
        return this;
    }

    /**
     * @param property the property to get the raw value for
     * @param <R>      the type of the property
     * @return the raw stored value for any property.
     * {@link #getOptional(SimpleProperty)} or {@link #get(SimpleProperty)} should be by api users
     */
    @SuppressWarnings("unchecked")
    @ApiStatus.Internal
    public <R> @Nullable R getRaw(MetadataProperty<R> property) {
        return (R) this.metadata.get(property);
    }

    /**
     * Copies all metadata values from this store into {@code target}, replacing
     * any values already present in {@code target}.
     *
     * @param target the target to copy to
     * @return this meta for chaining (which is updated)
     */
    public EntityMetadata copyTo(EntityMetadata target) {
        target.metadata.putAll(this.metadata);
        // views are tied to their parent store, they must not be copied
        // each store maintains its own view instances pointing back to itself
        target.views.clear();
        return this;
    }

    /**
     * Stores all the data from a packet in this meta wrapper.
     *
     * @param packet  the packet
     * @param version the version of the data inside the packet (probably just your server version)
     * @return this meta for chaining
     */
    public EntityMetadata setDataFromPacket(WrapperPlayServerEntityMetadata packet, ClientVersion version) {
        this.schema.applyPacketToStore(packet, this, version);
        return this;
    }

    /**
     * Creates a {@link WrapperPlayServerEntityMetadata} packet from the current
     * held metadata for the given entity id and version for the data.
     *
     * @param entityId the entity id include in the packet
     * @param version  the version to encode the data for
     * @return a new {@link WrapperPlayServerEntityMetadata} packet with the current data
     */
    public WrapperPlayServerEntityMetadata createPacket(int entityId, ClientVersion version) {
        return new WrapperPlayServerEntityMetadata(entityId, entityData(version));
    }

    @Override
    public List<EntityData<?>> entityData(ClientVersion version) {
        List<EntityData<?>> resolved = new ArrayList<>(this.metadata.size());

        for (Map.Entry<MetadataProperty<?>, Object> entry : this.metadata.entrySet()) {
            @SuppressWarnings("unchecked")
            MetadataProperty<Object> property = (MetadataProperty<Object>) entry.getKey();
            EntityData<?> data = property.createData(version, entry.getValue());
            if (data != null) resolved.add(data);
        }

        resolved.sort(Comparator.comparingInt(EntityData::getIndex));
        return resolved;
    }

    @Override
    public String toString() {
        return "EntityMetadata{" +
                "data=" + this.metadata +
                '}';
    }

}
