package dev.threeadd.metalib.entity.extension.impl;

import dev.threeadd.metalib.MetaLib;
import dev.threeadd.metalib.entity.ProtocolEntity;
import dev.threeadd.metalib.entity.event.EntityTickEvent;
import dev.threeadd.metalib.entity.extension.EntityExtension;
import dev.threeadd.metalib.platform.TaskScheduler;
import org.jetbrains.annotations.Nullable;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class TickExtension implements EntityExtension {

    private static final Set<ProtocolEntity> TO_TICK_ENTITIES = ConcurrentHashMap.newKeySet();
    private static @Nullable Runnable cancelHandle = null;

    private long tickCounter = 0L;

    @Override
    public void onAttach(ProtocolEntity entity) {

        synchronized (TO_TICK_ENTITIES) {
            TO_TICK_ENTITIES.add(entity);
            if (cancelHandle != null) return;

            TaskScheduler scheduler = MetaLib.getPlatform().getTaskScheduler();
            cancelHandle = scheduler.scheduleEveryTick(() -> {
                this.tickCounter++;
                EntityTickEvent tickEvent = new EntityTickEvent(this.tickCounter);
                for (ProtocolEntity toTick : TO_TICK_ENTITIES) {
                    toTick.getEventBus().post(tickEvent);
                }
            });
        }
    }

    @Override
    public void onDetach(ProtocolEntity entity) {
        synchronized (TO_TICK_ENTITIES) {
            TO_TICK_ENTITIES.remove(entity);

            if (TO_TICK_ENTITIES.isEmpty() && cancelHandle != null) {
                cancelHandle.run();
                cancelHandle = null;
            }
        }
    }

}
