package dev.threeadd.packetentities.entity.data;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;

public class EmptyProtocolObjectData implements ProtocolObjectData {

    @Override
    public int getObjectData(ServerVersion version) {
        return 0;
    }

    @Override
    public EntityType getBoundEntityType() {
        return EntityTypes.ENTITY;
    }

}
