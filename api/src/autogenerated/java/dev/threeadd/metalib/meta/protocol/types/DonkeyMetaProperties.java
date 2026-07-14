// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import dev.threeadd.metalib.meta.MetadataSchema;

/**
 * Metadata properties for the {@code Donkey} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Donkey">Donkey on the minecraft.wiki</a></p>
 */
public class DonkeyMetaProperties extends AbstractChestedHorseMetaProperties {

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractChestedHorseMetaProperties.SCHEMA.extend(EntityTypes.DONKEY)
        .build();

}
