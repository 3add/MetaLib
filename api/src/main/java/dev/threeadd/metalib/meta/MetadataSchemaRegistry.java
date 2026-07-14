package dev.threeadd.metalib.meta;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import dev.threeadd.metalib.meta.property.MetadataProperty;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

/**
 * Maps {@link EntityType}s to a {@link MetadataSchema} holding all the respective type's {@link MetadataProperty}s.
 */
public final class MetadataSchemaRegistry {

    private static final Map<EntityType, MetadataSchema> SCHEMAS = new ConcurrentHashMap<>();
    private static final Map<EntityType, Supplier<MetadataSchema>> LAZY_PROVIDERS = new ConcurrentHashMap<>();

    private MetadataSchemaRegistry() {
    }

    @ApiStatus.Internal
    public static void register(@Nullable EntityType type, MetadataSchema schema) {
        if (type == null) return;
        SCHEMAS.put(type, schema);
    }

    @ApiStatus.Internal
    public static void registerProvider(EntityType type, Supplier<MetadataSchema> provider) {
        LAZY_PROVIDERS.put(type, provider);
    }

    public static MetadataSchema getSchema(@Nullable EntityType type) {
        for (EntityType current = type; current != null; current = current.getParent().orElse(null)) {
            MetadataSchema schema = SCHEMAS.get(current);
            if (schema != null) return schema;

            Supplier<MetadataSchema> provider = LAZY_PROVIDERS.get(current);
            if (provider != null) {
                schema = provider.get();

                LAZY_PROVIDERS.remove(current);
                return schema;
            }
        }

        throw new IllegalArgumentException("No schema registered for EntityType " + type);
    }

    public static void loadAll() {
        for (EntityType type : LAZY_PROVIDERS.keySet()) {
            getSchema(type);
        }
    }

    public static Collection<MetadataSchema> getLoadedSchemas() {
        return SCHEMAS.values();
    }

}
