package dev.threeadd.packetentities.entity.meta;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.entity.data.EntityData;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMetadata;
import dev.threeadd.packetentities.entity.meta.field.IEntityMetaFieldHolder;
import dev.threeadd.packetentities.entity.meta.field.EntityMetaField;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Declares the set of {@link EntityMetaField}.
 * {@link IEntityMetaFieldHolder} uses this to group fields by entity type.
 */
public final class EntityMetaSchema {

    private final EntityType entityType;

    /**
     * version specific index ordered fields cache for faster lookups
     */
    private final Map<ServerVersion, EntityMetaField<?>[]> versionCache = new ConcurrentHashMap<>();
    private final Set<EntityMetaField<?>> fields;
    /**
     * highest metadata index of all fields stored or -1 if none of the fields have a version defined
     */
    private final int maxKnownIndex;

    private EntityMetaSchema(EntityType entityType, Set<EntityMetaField<?>> fields) {
        this.entityType = entityType;
        this.fields = new HashSet<>(fields);
        this.maxKnownIndex = fields.isEmpty() ? -1 : fields.stream()
                .mapToInt(EntityMetaField::getMaxIndex)
                .max()
                .orElse(-1);
        EntityMetaSchemaRegistry.register(this.entityType, this);
    }

    /**
     * builds {@link #versionCache}, a version specific index ordered fields cache
     */
    private EntityMetaField<?>[] getOrBuildCache(ServerVersion version) {
        return this.versionCache.computeIfAbsent(version, v -> {
            EntityMetaField<?>[] lookup = new EntityMetaField<?>[this.maxKnownIndex + 1];
            for (EntityMetaField<?> prop : this.fields) {
                int index = prop.getIndex(v);
                if (index >= 0 && index <= this.maxKnownIndex) {
                    lookup[index] = prop;
                }
            }
            return lookup;
        });
    }

    @SuppressWarnings("ConstantConditions")
    void applyPacketToStore(WrapperPlayServerEntityMetadata packet, ProtocolEntityMeta store, ServerVersion version) {
        EntityMetaField<?>[] fastLookup = getOrBuildCache(version);

        for (EntityData<?> data : packet.getEntityMetadata()) {
            int index = data.getIndex();
            if (index < 0 || index >= fastLookup.length) continue;

            EntityMetaField<?> candidate = fastLookup[index];
            if (candidate == null || candidate.getDataType(version) != data.getType()) continue;

            @SuppressWarnings("unchecked")
            EntityMetaField<Object> typed = (EntityMetaField<Object>) candidate;
            Object parsed = typed.parse(version, data);

            if (parsed == null) continue;
            store.setRaw(typed, parsed);
        }
    }

    public Set<EntityMetaField<?>> getFields() {
        return this.fields;
    }

    public EntityType getBoundEntityType() {
        return this.entityType;
    }

    public boolean contains(EntityMetaField<?> field) {
        return this.fields.contains(field);
    }

    public static Builder builder(EntityType type) {
        return new Builder(type);
    }

    public Builder extend(@Nullable EntityType type) {
        Builder builder = new Builder(type != null ? type : this.entityType);
        builder.props.addAll(this.fields);
        return builder;
    }

    public static final class Builder {

        private final EntityType entityType;
        private final LinkedHashSet<EntityMetaField<?>> props = new LinkedHashSet<>();

        private Builder(EntityType type) {
            this.entityType = type;
        }

        public Builder add(EntityMetaField<?>... fields) {
            this.props.addAll(Arrays.asList(fields));
            return this;
        }

        public EntityMetaSchema build() {
            return new EntityMetaSchema(this.entityType, this.props);
        }

    }

}
