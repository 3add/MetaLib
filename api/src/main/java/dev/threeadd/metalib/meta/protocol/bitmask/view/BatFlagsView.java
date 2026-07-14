package dev.threeadd.metalib.meta.protocol.bitmask.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.bitmask.BitmaskView;
import dev.threeadd.metalib.meta.protocol.types.BatMetaProperties;

/**
 * Represents {@link BatMetaProperties#FLAGS}
 */
public class BatFlagsView extends BitmaskView {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Bat
    private static final int MASK_IS_HANGING = 0x01;
    // rest is unused, nice and efficient mojang

    public BatFlagsView(EntityMetadata store) {
        super(store, BatMetaProperties.FLAGS);
    }

    public boolean isHanging() {
        return hasMask(MASK_IS_HANGING);
    }

    public void setHanging(boolean hanging) {
        setMask(MASK_IS_HANGING, hanging);
    }

}
