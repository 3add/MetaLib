package dev.threeadd.metalib.entity.data;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;

public class ProjectileObjectData extends OwnedEntityObjectData {

    public ProjectileObjectData(int owningEntityId) {
        super(EntityTypes.PROJECTILE_ABSTRACT, owningEntityId);
    }

}
