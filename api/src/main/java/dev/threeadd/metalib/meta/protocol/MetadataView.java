package dev.threeadd.metalib.meta.protocol;

import com.github.retrooper.packetevents.protocol.entity.data.EntityData;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.property.ViewProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A wrapper for a single {@link ViewProperty}'s value stored on {@link EntityMetadata},
 * extending "view" wrapper classes can get/set data using {@link #getRaw()} and {@link #setRaw(Object)}
 *
 * <p>A default {@link NotNull} value should be provided using {@link #getDefaultValue()}</p>
 *
 * @param <T> the raw type of the metadata property value
 */
public abstract class MetadataView<T> {

    private final EntityMetadata store;
    private final ViewProperty<T, ? extends MetadataView<T>> property;

    protected MetadataView(EntityMetadata store, ViewProperty<T, ? extends MetadataView<T>> property) {
        this.store = store;
        this.property = property;
    }

    /**
     * @return the underlying value this view wrapper represents
     */
    public final T getRaw() {
        T value = this.store.getRaw(this.property);
        return value != null ? value : getDefaultValue();
    }

    /**
     * Sets the underlying value this view wrapper represents
     * @param raw the raw value to set
     */
    public final void setRaw(T raw) {
        this.store.setRaw(this.property, raw);
    }

    public @Nullable EntityData<?> toEntityData(ClientVersion version) {
        return this.property.createData(version, getRaw());
    }

    protected abstract T getDefaultValue();

    protected final EntityMetadata getStore() {
        return this.store;
    }

    protected final ViewProperty<T, ? extends MetadataView<T>> getProperty() {
        return this.property;
    }

}