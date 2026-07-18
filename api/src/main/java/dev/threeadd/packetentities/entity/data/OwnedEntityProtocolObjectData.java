package dev.threeadd.packetentities.entity.data;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;

public abstract class OwnedEntityProtocolObjectData implements ProtocolObjectData {

    private final EntityType boundEntityType;
    private final int objectData;

    public OwnedEntityProtocolObjectData(EntityType boundEntityType, int owningEntityId) {
        this.boundEntityType = boundEntityType;
        this.objectData = owningEntityId;
    }

    @Override
    public int getObjectData(ServerVersion version) {
        return this.objectData;
    }

    @Override
    public EntityType getBoundEntityType() {
        return this.boundEntityType;
    }

}
