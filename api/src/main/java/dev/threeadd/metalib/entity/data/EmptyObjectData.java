package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public class EmptyObjectData implements ObjectData {

    @Override
    public int getObjectData(ClientVersion version) {
        return 0;
    }

    @Override
    public EntityType getBoundEntityType() {
        return EntityTypes.ENTITY;
    }

}
