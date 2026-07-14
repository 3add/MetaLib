package dev.threeadd.metalib;

import com.github.retrooper.packetevents.PacketEvents;
import dev.threeadd.metalib.entity.tracking.EntityManager;
import dev.threeadd.metalib.entity.viewer.ViewerManagerListener;
import dev.threeadd.metalib.meta.protocol.EntityTypeSchemas;
import dev.threeadd.metalib.setting.MetaLibAPISettings;

public class MetaLibAPI {

    private final EntityManager entityManager;
    private final MetaLibAPISettings settings;

    public MetaLibAPI(MetaLibAPISettings settings) {
        this.entityManager = new EntityManager();
        this.settings = settings;

        EntityTypeSchemas.init(); // load lazy suppliers
        PacketEvents.getAPI().getEventManager().registerListener(new ViewerManagerListener());
    }

    public EntityManager getEntityManager() {
        return this.entityManager;
    }

    public MetaLibAPISettings getSettings() {
        return this.settings;
    }

}
