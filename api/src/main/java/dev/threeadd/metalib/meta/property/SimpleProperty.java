package dev.threeadd.metalib.meta.property;

import com.github.retrooper.packetevents.protocol.player.ClientVersion;

import java.util.NavigableMap;

/**
 * Represents a simple {@link MetadataProperty}
 *
 * @param <T> The protocol value type (and returned type)
 * @see ViewProperty
 */
public class SimpleProperty<T> extends MetadataProperty<T> {

    private SimpleProperty(NavigableMap<ClientVersion, VersionedMapping<T, ?>> versions) {
        super(versions);
    }

    public static <T> Builder<T> builder() {
        return new Builder<>();
    }

    public static class Builder<T> extends BaseBuilder<T, Builder<T>> {

        @Override
        public SimpleProperty<T> build() {
            return new SimpleProperty<>(this.versions);
        }

    }

}
