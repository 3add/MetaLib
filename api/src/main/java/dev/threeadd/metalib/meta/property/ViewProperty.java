package dev.threeadd.metalib.meta.property;

import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.MetadataView;

import java.util.NavigableMap;
import java.util.function.Function;

/**
 * Represent a {@link MetadataProperty} where the value is a {@link MetadataView}
 *
 * @param <T> The type of data the view represents
 * @param <V> The view wrapper type
 * @see SimpleProperty
 */
public final class ViewProperty<T, V extends MetadataView<T>> extends MetadataProperty<T> {

    private final Function<EntityMetadata, V> viewFactory;

    private ViewProperty(NavigableMap<ClientVersion, VersionedMapping<T, ?>> versions, Function<EntityMetadata, V> viewFactory) {
        super(versions);
        this.viewFactory = viewFactory;
    }

    /**
     * Creates a new wrapper instance bound to the given metadata store.
     *
     * @param store the handle entity, to apply data to when using the setters or get data from using the getters
     * @return the view
     * @throws IllegalStateException if no factory was provided at build time
     */
    public V createView(EntityMetadata store) {
        return this.viewFactory.apply(store);
    }

    @Override
    public String toString() {
        return "ViewProperty{" +
                "maxIndex=" + getMaxIndex() +
                '}';
    }

    public static <T, V extends MetadataView<T>> Builder<T, V> builder(Function<EntityMetadata, V> wrapperFactory) {
        return new Builder<>(wrapperFactory);
    }

    public static class Builder<T, V extends MetadataView<T>> extends BaseBuilder<T, Builder<T, V>> {

        private final Function<EntityMetadata, V> wrapperFactory;

        public Builder(Function<EntityMetadata, V> wrapperFactory) {
            this.wrapperFactory = wrapperFactory;
        }

        @Override
        public ViewProperty<T, V> build() {
            return new ViewProperty<>(this.versions, this.wrapperFactory);
        }

    }

}
