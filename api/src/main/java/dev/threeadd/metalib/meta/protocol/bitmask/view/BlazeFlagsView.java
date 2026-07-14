package dev.threeadd.metalib.meta.protocol.bitmask.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.bitmask.BitmaskView;
import dev.threeadd.metalib.meta.protocol.types.BlazeMetaProperties;

/**
 * Represents {@link BlazeMetaProperties#FLAGS}
 */
public class BlazeFlagsView extends BitmaskView {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Blaze
    private static final int MASK_IS_ON_FIRE = 0x01;
    // rest is unused, nice and efficient mojang

    public BlazeFlagsView(EntityMetadata store) {
        super(store, BlazeMetaProperties.FLAGS);
    }

    public boolean isOnFire() {
        return hasMask(MASK_IS_ON_FIRE);
    }

    public void setOnFire(boolean onFire) {
        setMask(MASK_IS_ON_FIRE, onFire);
    }

}
