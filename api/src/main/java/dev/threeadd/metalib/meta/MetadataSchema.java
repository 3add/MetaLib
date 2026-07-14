package dev.threeadd.metalib.meta;

import com.github.retrooper.packetevents.protocol.entity.data.EntityData;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.wrapper.play.server.WrapperPlayServerEntityMetadata;
import dev.threeadd.metalib.meta.property.IMetadataPropertyHolder;
import dev.threeadd.metalib.meta.property.MetadataProperty;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Declares the set of {@link MetadataProperty}.
 * {@link IMetadataPropertyHolder} uses this to group properties by entity type.
 */
public final class MetadataSchema {

    private final EntityType entityType;

    /**
     * version specific index ordered properties cache for faster lookups
     */
    private final Map<ClientVersion, MetadataProperty<?>[]> versionCache = new ConcurrentHashMap<>();
    private final Set<MetadataProperty<?>> properties;
    /**
     * highest metadata index of all properties stored or -1 if none of the properties have a version defined
     */
    private final int maxKnownIndex;

    private MetadataSchema(EntityType entityType, Set<MetadataProperty<?>> properties) {
        this.entityType = entityType;
        this.properties = new HashSet<>(properties);
        this.maxKnownIndex = properties.isEmpty() ? -1 : properties.stream()
                .mapToInt(MetadataProperty::getMaxIndex)
                .max()
                .orElse(-1);
        MetadataSchemaRegistry.register(this.entityType, this);
    }

    /**
     * builds {@link #versionCache}, a version specific index ordered properties cache
     */
    private MetadataProperty<?>[] getOrBuildCache(ClientVersion version) {
        return this.versionCache.computeIfAbsent(version, v -> {
            MetadataProperty<?>[] lookup = new MetadataProperty<?>[this.maxKnownIndex + 1];
            for (MetadataProperty<?> prop : this.properties) {
                int index = prop.getIndex(v);
                if (index >= 0 && index <= this.maxKnownIndex) {
                    lookup[index] = prop;
                }
            }
            return lookup;
        });
    }

    @SuppressWarnings("ConstantConditions")
    void applyPacketToStore(WrapperPlayServerEntityMetadata packet, EntityMetadata store, ClientVersion version) {
        MetadataProperty<?>[] fastLookup = getOrBuildCache(version);

        for (EntityData<?> data : packet.getEntityMetadata()) {
            int index = data.getIndex();
            if (index < 0 || index >= fastLookup.length) continue;

            MetadataProperty<?> candidate = fastLookup[index];
            if (candidate == null || candidate.getDataType(version) != data.getType()) continue;

            @SuppressWarnings("unchecked")
            MetadataProperty<Object> typed = (MetadataProperty<Object>) candidate;
            Object parsed = typed.parse(version, data);

            if (parsed == null) continue;
            store.setRaw(typed, parsed);
        }
    }

    public Set<MetadataProperty<?>> getProperties() {
        return this.properties;
    }

    public EntityType getBoundEntityType() {
        return this.entityType;
    }

    public boolean contains(MetadataProperty<?> property) {
        return this.properties.contains(property);
    }

    public static Builder builder(EntityType type) {
        return new Builder(type);
    }

    public Builder extend(@Nullable EntityType type) {
        Builder builder = new Builder(type != null ? type : this.entityType);
        builder.props.addAll(this.properties);
        return builder;
    }

    public static final class Builder {

        private EntityType entityType;
        private final LinkedHashSet<MetadataProperty<?>> props = new LinkedHashSet<>();

        private Builder(EntityType type) {
            this.entityType = type;
        }

        public Builder entityType(EntityType entityType) {
            this.entityType = Objects.requireNonNull(entityType, "entityType must not be null");
            return this;
        }

        public Builder add(MetadataProperty<?>... properties) {
            this.props.addAll(Arrays.asList(properties));
            return this;
        }

        public MetadataSchema build() {
            return new MetadataSchema(this.entityType, this.props);
        }

    }

}
