package dev.threeadd.metalib.meta.protocol.bitmask.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.bitmask.BitmaskView;
import dev.threeadd.metalib.meta.protocol.types.AbstractArrowMetaProperties;

/**
 * Represents {@link AbstractArrowMetaProperties#ID_FLAGS}
 */
public class AbstractArrowIdFlagsView extends BitmaskView {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Arrow
    private static final int MASK_IS_CRITICAL = 0x01;
    private static final int MASK_IS_NOCLIP = 0x02;
    // rest unused

    public AbstractArrowIdFlagsView(EntityMetadata store) {
        super(store, AbstractArrowMetaProperties.ID_FLAGS);
    }

    public boolean isCritical() {
        return hasMask(MASK_IS_CRITICAL);
    }

    public void setIsCritical(boolean value) {
        setMask(MASK_IS_CRITICAL, value);
    }

    /**
     * used by loyalty tridents when returning
     * @return whether this arrow is noclip
     */
    public boolean isNoClip() {
        return hasMask(MASK_IS_NOCLIP);
    }

    /**
     * used by loyalty tridents when returning
     * @param value whether this arrow is noclip
     */
    public void setNoClip(boolean value) {
        setMask(MASK_IS_NOCLIP, value);
    }

}
