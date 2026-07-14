package dev.threeadd.metalib.meta.protocol.bitmask.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.bitmask.BitmaskView;
import dev.threeadd.metalib.meta.protocol.types.ArmorStandMetaProperties;

/**
 * Represents {@link ArmorStandMetaProperties#CLIENT_FLAGS}
 */
public class ArmorStandClientFlagsView extends BitmaskView {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Armor_Stand
    private static final int MASK_IS_SMALL = 0x01;
    // 0x02 unused
    private static final int MASK_HAS_ARMS = 0x04;
    private static final int MASK_HAS_NO_BASEPLATE = 0x08;
    private static final int MASK_IS_MARKER = 0x10;
    // rest unused

    public ArmorStandClientFlagsView(EntityMetadata store) {
        super(store, ArmorStandMetaProperties.CLIENT_FLAGS);
    }

    public boolean isSmall() {
        return hasMask(MASK_IS_SMALL);
    }

    public void setIsSmall(boolean value) {
        setMask(MASK_IS_SMALL, value);
    }

    public boolean hasArms() {
        return hasMask(MASK_HAS_ARMS);
    }

    public void setHasArms(boolean value) {
        setMask(MASK_HAS_ARMS, value);
    }

    public boolean hasBasePlate() {
        return !hasMask(MASK_HAS_NO_BASEPLATE);
    }

    public void setHasBasePlate(boolean value) {
        setMask(MASK_HAS_NO_BASEPLATE, !value);
    }

    public boolean isMarker() {
        return hasMask(MASK_IS_MARKER);
    }

    public void setIsMarker(boolean value) {
        setMask(MASK_IS_MARKER, value);
    }

}
