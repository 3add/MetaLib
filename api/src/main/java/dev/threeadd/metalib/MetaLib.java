package dev.threeadd.metalib;

import dev.threeadd.metalib.platform.Platform;
import org.jetbrains.annotations.Nullable;

public class MetaLib {

    private static @Nullable Platform platform;

    private MetaLib() {
    }

    public static void init(Platform platform) {
        if (MetaLib.platform != null) {
            throw new IllegalStateException("MetaLib is already initialized!");
        }

        MetaLib.platform = platform;
    }

    public static MetaLibAPI getAPI() {
        if (platform == null) {
            throw new IllegalStateException("MetaLib has not been initialized");
        }
        return platform.getAPI();
    }

    public static Platform getPlatform() {
        if (platform == null) {
            throw new IllegalStateException("MetaLib has not been initialized");
        }
        return platform;
    }

}
