package dev.threeadd.metalib.meta.protocol.bitmask.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.bitmask.BitmaskView;
import dev.threeadd.metalib.meta.protocol.types.BeeMetaProperties;

/**
 * Represents {@link BeeMetaProperties#FLAGS}
 */
public class BeeFlagsView extends BitmaskView {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Bee
    // 0x01 unused
    private static final int MASK_IS_ANGRY = 0x02;
    private static final int MASK_HAS_STUNG = 0x04;
    private static final int MASK_HAS_NECTAR = 0x08;
    // rest unused

    public BeeFlagsView(EntityMetadata store) {
        super(store, BeeMetaProperties.FLAGS);
    }

    public boolean isAngry() {
        return hasMask(MASK_IS_ANGRY);
    }

    public void setAngry(boolean value) {
        setMask(MASK_IS_ANGRY, value);
    }

    public boolean hasStung() {
        return hasMask(MASK_HAS_STUNG);
    }

    public void setStung(boolean value) {
        setMask(MASK_HAS_STUNG, value);
    }

    public boolean hasNectar() {
        return hasMask(MASK_HAS_NECTAR);
    }

    public void setNectar(boolean value) {
        setMask(MASK_HAS_NECTAR, value);
    }

}
