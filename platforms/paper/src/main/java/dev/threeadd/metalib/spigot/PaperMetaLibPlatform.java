package dev.threeadd.metalib.spigot;

import dev.threeadd.metalib.MetaLibAPI;
import dev.threeadd.metalib.platform.*;
import dev.threeadd.metalib.setting.MetaLibAPISettings;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class PaperMetaLibPlatform implements Platform {

    private final Logger logger;
    private final EntityIdProvider<Entity> entityIdProvider;
    private final WorldProvider<World> worldProvider;
    private final TaskScheduler taskScheduler;
    private final MetaLibAPI api;

    public PaperMetaLibPlatform(JavaPlugin plugin, MetaLibAPISettings settings) {
        this.logger = plugin.getLogger();
        this.entityIdProvider = new PaperEntityIdProvider();
        this.worldProvider = new PaperWorldProvider();
        this.taskScheduler = new PaperTaskScheduler(plugin);
        this.api = new MetaLibAPI(settings);
    }

    @Override
    public Logger getLogger() {
        return this.logger;
    }

    @Override
    public EntityIdProvider<Entity> getEntityIdProvider() {
        return this.entityIdProvider;
    }

    @Override
    public WorldProvider<World> getWorldProvider() {
        return this.worldProvider;
    }

    @Override
    public TaskScheduler getTaskScheduler() {
        return this.taskScheduler;
    }

    @Override
    public MetaLibAPI getAPI() {
        return this.api;
    }

}
