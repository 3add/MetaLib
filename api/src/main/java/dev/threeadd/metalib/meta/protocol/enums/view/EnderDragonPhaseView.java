package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ChronologicalProtocolEnum;
import dev.threeadd.metalib.meta.protocol.enums.VarIntEnumView;
import dev.threeadd.metalib.meta.protocol.types.EnderDragonMetaProperties;

/**
 * Represents {@link EnderDragonMetaProperties#PHASE}
 */
public class EnderDragonPhaseView extends VarIntEnumView<EnderDragonPhaseView.Phase> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ender_Dragon
    public enum Phase implements ChronologicalProtocolEnum {
        CIRCLING,
        STRAFING,
        FLYING_TO_PORTAL,
        TAKING_OFF_FROM_PORTAL,
        LANDED_PERFORM_ATTACK,
        LANDED_LOOKING_FOR_PLAYER,
        LANDED_ROAR,
        CHARGING_PLAYER,
        FLYING_TO_PORTAL_TO_DIE,
        HOVERING_NO_AI
    }

    public EnderDragonPhaseView(EntityMetadata store) {
        super(store, EnderDragonMetaProperties.PHASE, Phase.class, Phase.HOVERING_NO_AI);
    }

}
