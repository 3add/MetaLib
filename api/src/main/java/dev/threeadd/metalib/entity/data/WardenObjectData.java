package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public enum WardenObjectData implements ObjectData {
    NONE(0),
    EMERGING_POSE(1);

    private final int objectData;

    WardenObjectData(int objectData) {
        this.objectData = objectData;
    }

    @Override
    public int getObjectData(ClientVersion version) {
        return this.objectData;
    }

    @Override
    public EntityType getBoundEntityType() {
        return EntityTypes.WARDEN;
    }

}
