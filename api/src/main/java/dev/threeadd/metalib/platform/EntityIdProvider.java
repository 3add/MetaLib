package dev.threeadd.metalib.platform;

import dev.threeadd.metalib.world.ProtocolWorld;

public interface EntityIdProvider<T> {

    int provide(ProtocolWorld world);

    int provide(T platformEntity);

}
