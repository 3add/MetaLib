package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ChronologicalProtocolEnum;
import dev.threeadd.metalib.meta.protocol.enums.VarIntEnumView;
import dev.threeadd.metalib.meta.protocol.types.SalmonMetaProperties;

/**
 * Represents {@link SalmonMetaProperties#TYPE}
 */
public class SalmonTypeView extends VarIntEnumView<SalmonTypeView.Type> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Salmon
    public enum Type implements ChronologicalProtocolEnum {
        SMALL,
        MEDIUM,
        LARGE
    }

    public SalmonTypeView(EntityMetadata store) {
        super(store, SalmonMetaProperties.TYPE, Type.class, Type.MEDIUM);
    }

}
