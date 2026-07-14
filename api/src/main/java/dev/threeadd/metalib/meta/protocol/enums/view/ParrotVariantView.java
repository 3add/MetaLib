package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ChronologicalProtocolEnum;
import dev.threeadd.metalib.meta.protocol.enums.VarIntEnumView;
import dev.threeadd.metalib.meta.protocol.types.ParrotMetaProperties;

/**
 * Represents {@link ParrotMetaProperties#VARIANT}
 */
public class ParrotVariantView extends VarIntEnumView<ParrotVariantView.Variant> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Parrot
    public enum Variant implements ChronologicalProtocolEnum {
        RED_BLUE,
        BLUE,
        GREEN,
        YELLO_BLUE,
        GREY
    }

    public ParrotVariantView(EntityMetadata store) {
        super(store, ParrotMetaProperties.VARIANT, Variant.class, Variant.RED_BLUE);
    }

}
