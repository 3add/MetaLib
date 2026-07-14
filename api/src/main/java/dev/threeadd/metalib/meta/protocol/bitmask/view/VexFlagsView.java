package dev.threeadd.metalib.meta.protocol.bitmask.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.bitmask.BitmaskView;
import dev.threeadd.metalib.meta.protocol.types.VexMetaProperties;

/**
 * Represents {@link VexMetaProperties#FLAGS}
 */
public class VexFlagsView extends BitmaskView {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Vex
    private static final int MASK_IS_ATTACKING = 0x01;
    // rest is unused, nice efficiency mojang

    public VexFlagsView(EntityMetadata store) {
        super(store, VexMetaProperties.FLAGS);
    }

    public boolean isAttacking() {
        return hasMask(MASK_IS_ATTACKING);
    }

    public void setAttacking(boolean value) {
        setMask(MASK_IS_ATTACKING, value);
    }

}
