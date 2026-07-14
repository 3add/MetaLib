package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ChronologicalProtocolEnum;
import dev.threeadd.metalib.meta.protocol.enums.VarIntEnumView;
import dev.threeadd.metalib.meta.protocol.types.AxolotlMetaProperties;

/**
 * Represents {@link AxolotlMetaProperties#VARIANT}
 */
public class AxolotlVariantView extends VarIntEnumView<AxolotlVariantView.Variant> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Axolotl
    public enum Variant implements ChronologicalProtocolEnum {
        LUCY,
        WILD,
        GOLD,
        CYAN,
        BLUE
    }

    public AxolotlVariantView(EntityMetadata store) {
        super(store, AxolotlMetaProperties.VARIANT, Variant.class, Variant.LUCY);
    }

}

