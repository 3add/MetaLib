package dev.threeadd.packetentities.entity.data;

import com.github.retrooper.packetevents.manager.server.ServerVersion;
import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;

public enum PaintingProtocolObjectData implements ProtocolObjectData {
    NORTH(2),
    SOUTH(3),
    WEST(4),
    EAST(5);

    private final int objectData;

    PaintingProtocolObjectData(int objectData) {
        this.objectData = objectData;
    }

    @Override
    public int getObjectData(ServerVersion version) {
        return this.objectData;
    }

    @Override
    public EntityType getBoundEntityType() {
        return EntityTypes.PAINTING;
    }
}
