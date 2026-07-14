package dev.threeadd.metalib.setting;

public class MetaLibAPISetting<T> {

    private final T defaultValue;
    private T value;

    public MetaLibAPISetting(T defaultValue) {
        this.defaultValue = defaultValue;
        this.value = defaultValue;
    }

    public T get() {
        return this.value;
    }

    public void set(T value) {
        this.value = value;
    }

    public T getDefault() {
        return this.defaultValue;
    }

    public void reset() {
        this.value = this.defaultValue;
    }

}
