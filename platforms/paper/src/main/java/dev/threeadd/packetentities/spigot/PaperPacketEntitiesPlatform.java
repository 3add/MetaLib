package dev.threeadd.packetentities.spigot;

import dev.threeadd.packetentities.PacketEntitiesAPI;
import dev.threeadd.packetentities.platform.Platform;
import dev.threeadd.packetentities.setting.PacketEntitiesAPISettings;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class PaperPacketEntitiesPlatform implements Platform {

    private final Logger logger;
    private final PaperEntityIdProvider entityIdProvider;
    private final PaperWorldProvider worldProvider;
    private final PaperTaskScheduler taskScheduler;
    private final PacketEntitiesAPI api;

    public PaperPacketEntitiesPlatform(JavaPlugin plugin, PacketEntitiesAPISettings settings) {
        this.logger = plugin.getLogger();
        this.entityIdProvider = new PaperEntityIdProvider();
        this.worldProvider = new PaperWorldProvider();
        this.taskScheduler = new PaperTaskScheduler(plugin);
        this.api = new PacketEntitiesAPI(settings);
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public PaperEntityIdProvider getEntityIdProvider() {
        return this.entityIdProvider;
    }

    @Override
    public PaperWorldProvider getWorldProvider() {
        return this.worldProvider;
    }

    @Override
    public PaperTaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    @Override
    public PacketEntitiesAPI getAPI() {
        return this.api;
    }

}
