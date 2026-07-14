package dev.threeadd.metalib.velocity;

import com.velocitypowered.api.proxy.ProxyServer;
import dev.threeadd.metalib.MetaLibAPI;
import dev.threeadd.metalib.platform.EntityIdProvider;
import dev.threeadd.metalib.platform.Platform;
import dev.threeadd.metalib.platform.TaskScheduler;
import dev.threeadd.metalib.platform.WorldProvider;
import dev.threeadd.metalib.setting.MetaLibAPISettings;

import java.util.logging.Logger;

public class VelocityMetaLibPlatform implements Platform {

    private final EntityIdProvider<?> entityIdProvider;
    private final WorldProvider<?> worldProvider;
    private final TaskScheduler taskScheduler;
    private final MetaLibAPI api;

    public VelocityMetaLibPlatform(ProxyServer server, Object plugin, MetaLibAPISettings settings) {
        this.entityIdProvider = new VelocityEntityIdProvider();
        this.worldProvider = new VelocityWorldProvider(new VelocityWorldTracker());
        this.taskScheduler = new VelocityTaskScheduler(server, plugin);
        this.api = new MetaLibAPI(settings);
    }

    @Override
    public Logger getLogger() {
        return Logger.getLogger("VelocityMetaLib");
    }

    @Override
    public EntityIdProvider<?> getEntityIdProvider() {
        return this.entityIdProvider;
    }

    @Override
    public WorldProvider<?> getWorldProvider() {
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
