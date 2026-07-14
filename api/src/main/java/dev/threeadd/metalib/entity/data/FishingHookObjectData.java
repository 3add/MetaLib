package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;

public class FishingHookObjectData extends OwnedEntityObjectData {

    public FishingHookObjectData(int owningEntityId) {
        super(EntityTypes.FISHING_BOBBER, owningEntityId);
    }

}
