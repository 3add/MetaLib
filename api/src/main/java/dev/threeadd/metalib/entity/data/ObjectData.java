package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public interface ObjectData {

    int getObjectData(ClientVersion version);

    EntityType getBoundEntityType();

}
