package dev.threeadd.metalib.meta.protocol.enums.view;

import dev.threeadd.metalib.meta.EntityMetadata;
import dev.threeadd.metalib.meta.protocol.enums.ByteEnumView;
import dev.threeadd.metalib.meta.protocol.enums.ChronologicalProtocolEnum;
import dev.threeadd.metalib.meta.protocol.types.SpellcasterIllagerMetaProperties;

/**
 * Represents {@link SpellcasterIllagerMetaProperties#SPELL_CASTING}
 */
public class SpellcasterIllagerSpellCastingView extends ByteEnumView<SpellcasterIllagerSpellCastingView.Spell> {

    // https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Spellcaster_Illager
    public enum Spell implements ChronologicalProtocolEnum {
        NONE,
        SUMMON_VEX,
        ATTACK,
        WOLOLO,
        DISAPPEAR,
        BLINDNESS
    }

    public SpellcasterIllagerSpellCastingView(EntityMetadata store) {
        super(store, SpellcasterIllagerMetaProperties.SPELL_CASTING, Spell.class, Spell.NONE);
    }

}
