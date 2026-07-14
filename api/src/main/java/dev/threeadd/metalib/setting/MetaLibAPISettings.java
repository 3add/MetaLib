package dev.threeadd.metalib.setting;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MetaLibAPISettings {

    private final Map<MetaLibAPISetting<?>, Object> settings = new ConcurrentHashMap<>();

    @SuppressWarnings("unchecked")
    public <T> T get(MetaLibAPISetting<T> setting) {
        return (T) this.settings.getOrDefault(setting, setting.getDefault());
    }

    public <T> MetaLibAPISettings set(MetaLibAPISetting<T> setting, T value) {
        this.settings.put(setting, value);
        return this;
    }

    public <T> MetaLibAPISettings reset(MetaLibAPISetting<T> setting) {
        this.settings.remove(setting);
        return this;
    }

}
