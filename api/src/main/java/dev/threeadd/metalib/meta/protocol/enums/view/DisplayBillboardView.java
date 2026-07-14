package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ByteEnumView;
import dev.threeadd.metalib.meta.protocol.enums.ChronologicalProtocolEnum;
import dev.threeadd.metalib.meta.protocol.types.DisplayMetaProperties;

/**
 * Represents {@link DisplayMetaProperties#BILLBOARD_RENDER_CONSTRAINTS}
 */
public class DisplayBillboardView extends ByteEnumView<DisplayBillboardView.Constraints> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Display
    public enum Constraints implements ChronologicalProtocolEnum {
        /**
         * No automatic rotation, orientation is fully manual
         */
        FIXED,
        /**
         * The display rotates freely on both axes to always face the camera.
         */
        CENTER,
        /**
         * Rotates only around the vertical (Y) axis to face the camera.
         */
        VERTICAL,
        /**
         * Rotates only around the horizontal axis to face the camera.
         */
        HORIZONTAL
    }

    public DisplayBillboardView(EntityMetadata store) {
        super(store, DisplayMetaProperties.BILLBOARD_RENDER_CONSTRAINTS, Constraints.class, Constraints.FIXED);
    }

}
