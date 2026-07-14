package dev.threeadd.metalib.platform;

import dev.threeadd.metalib.MetaLibAPI;

import java.util.logging.Logger;

public interface Platform {

    Logger getLogger();

    EntityIdProvider<?> getEntityIdProvider();

    WorldProvider<?> getWorldProvider();

    TaskScheduler getTaskScheduler();

    MetaLibAPI getAPI();

}
