package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityType;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;

public enum ItemFrameObjectData implements ObjectData {
    DOWN(0),
    UP(1),
    NORTH(2),
    SOUTH(3),
    WEST(4),
    EAST(5);

    private final int objectData;

    ItemFrameObjectData(int objectData) {
        this.objectData = objectData;
    }

    @Override
    public int getObjectData(ClientVersion version) {
        return this.objectData;
    }

    @Override
    public EntityType getBoundEntityType() {
        return EntityTypes.ITEM_FRAME;
    }

}
