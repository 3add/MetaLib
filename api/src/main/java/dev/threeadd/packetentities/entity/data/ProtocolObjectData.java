package dev.threeadd.packetentities.entity.data;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;

public interface ProtocolObjectData {

    int getObjectData(ServerVersion version);

    EntityType getBoundEntityType();

}
