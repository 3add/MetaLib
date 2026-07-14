package dev.threeadd.metalib.meta.property;

import com.github.retrooper.packetevents.protocol.entity.data.EntityData;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataType;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.Function;

/**
 * A versioned mapping between a logical value type {@code R} and the
 * PacketEvents protocol representation {@code W}.
 *
 * <p>Properties are immutable after construction and safe to hold as {@code static final}
 * constants. They carry no reference to an entity type — entity-type scoping is handled
 * externally by {@link MetadataSchema}.</p>
 *
 * @param <T> the logical value type read and written by library user code
 * @see SimpleProperty
 * @see ViewProperty
 */
public abstract class MetadataProperty<T> {

    private final NavigableMap<ClientVersion, VersionedMapping<T, ?>> versions;

    protected MetadataProperty(NavigableMap<ClientVersion, VersionedMapping<T, ?>> versions) {
        this.versions = versions;
    }

    public int getIndex(@Nullable ClientVersion version) {
        if (version == null) return -1;
        Map.Entry<ClientVersion, VersionedMapping<T, ?>> entry = this.versions.floorEntry(version);
        return entry != null ? entry.getValue().index : -1;
    }

    /**
     * Returns the highest packet metadata index assigned to this property
     * across all registered versions
     *
     * @return the maximum metadata index found, or {@code -1} if no
     * version mappings are defined
     */
    public int getMaxIndex() {
        int max = -1;
        for (VersionedMapping<T, ?> mapping : this.versions.values()) {
            if (mapping.index > max) max = mapping.index;
        }
        return max;
    }

    public @Nullable EntityDataType<?> getDataType(@Nullable ClientVersion version) {
        if (version == null) return null;
        Map.Entry<ClientVersion, VersionedMapping<T, ?>> entry = this.versions.floorEntry(version);
        return entry != null ? entry.getValue().type : null;
    }

    public @Nullable T parse(@Nullable ClientVersion version, @Nullable EntityData<?> data) {
        if (data == null || version == null) return null;
        Map.Entry<ClientVersion, VersionedMapping<T, ?>> entry = this.versions.floorEntry(version);
        if (entry == null) return null;
        return entry.getValue().deserialize(data.getValue());
    }

    public @Nullable EntityData<?> createData(@Nullable ClientVersion version, T rawValue) {
        if (version == null) return null;
        Map.Entry<ClientVersion, VersionedMapping<T, ?>> entry = this.versions.floorEntry(version);
        if (entry == null) return null;
        return entry.getValue().createData(rawValue);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "maxIndex=" + getMaxIndex() +
                ", registeredVersions=" + this.versions.keySet() +
                '}';
    }

    /**
     * An abstract builder providing shared version mapping logic
     *
     * @param <T> The logical value type
     * @param <B> The concrete builder implementation type
     */
    public abstract static class BaseBuilder<T, B extends BaseBuilder<T, B>> {

        protected final NavigableMap<ClientVersion, VersionedMapping<T, ?>> versions = new TreeMap<>();

        @SuppressWarnings("unchecked")
        protected final B self() {
            return (B) this;
        }

        public B addVersion(ClientVersion version, int index, EntityDataType<T> type) {
            this.versions.put(version, new VersionedMapping<>(index, type, Function.identity(), Function.identity()));
            return self();
        }

        public <N> B addVersion(ClientVersion version, int index, EntityDataType<N> type, Function<T, N> serializer, Function<N, T> deserializer) {
            this.versions.put(version, new VersionedMapping<>(index, type, serializer, deserializer));
            return self();
        }

        public abstract MetadataProperty<T> build();

    }

    protected static class VersionedMapping<T, P> {

        final int index;
        final EntityDataType<P> type;
        private final Function<T, P> serializer;
        private final Function<P, T> deserializer;

        VersionedMapping(int index, EntityDataType<P> type, Function<T, P> serializer, Function<P, T> deserializer) {
            this.index = index;
            this.type = type;
            this.serializer = serializer;
            this.deserializer = deserializer;
        }

        EntityData<P> createData(T logicalValue) {
            return new EntityData<>(this.index, this.type, this.serializer.apply(logicalValue));
        }

        @SuppressWarnings("unchecked")
        T deserialize(Object packetEventsValue) {
            return this.deserializer.apply((P) packetEventsValue);
        }

        @Override
        public String toString() {
            return "Mapping{index=" + this.index + ", type=" + this.type + "}";
        }

    }

}
