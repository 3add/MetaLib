package dev.threeadd.metalib.spigot;

import dev.threeadd.metalib.platform.EntityIdProvider;
import dev.threeadd.metalib.world.ProtocolWorld;
import io.github.retrooper.packetevents.util.SpigotReflectionUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;

public class PaperEntityIdProvider implements EntityIdProvider<Entity> {

    @SuppressWarnings("UnstableApiUsage")
    @Override
    public int provide(ProtocolWorld world) {
        return SpigotReflectionUtil.generateEntityId(Bukkit.getWorld(world.getWorldName()));
    }

    @Override
    public int provide(Entity platformEntity) {
        return platformEntity.getEntityId();
    }

}
