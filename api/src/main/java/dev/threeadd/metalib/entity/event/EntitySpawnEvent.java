package dev.threeadd.metalib.entity.event;

import dev.threeadd.metalib.entity.ProtocolEntity;
import dev.threeadd.metalib.event.CancellableEvent;

/**
 * Called when a {@link ProtocolEntity} is spawned,
 * to intercept the packet line look at {@link ViewerShowEntityEvent}
 */
public class EntitySpawnEvent extends CancellableEvent {

    public EntitySpawnEvent() {
        super();
    }

}
