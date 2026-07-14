package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public abstract class OwnedEntityObjectData implements ObjectData {

    private final EntityType boundEntityType;
    private final int objectData;

    public OwnedEntityObjectData(EntityType boundEntityType, int owningEntityId) {
        this.boundEntityType = boundEntityType;
        this.objectData = owningEntityId;
    }

    @Override
    public int getObjectData(ClientVersion version) {
        return this.objectData;
    }

    @Override
    public EntityType getBoundEntityType() {
        return this.boundEntityType;
    }

}
