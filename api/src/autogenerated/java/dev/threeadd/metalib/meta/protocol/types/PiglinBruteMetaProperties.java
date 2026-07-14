// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import dev.threeadd.metalib.meta.MetadataSchema;

/**
 * Metadata properties for the {@code Piglin Brute} meta
 * <p>Supported Versions: {@code 1.16.2+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Piglin_Brute">Piglin Brute on the minecraft.wiki</a></p>
 */
public class PiglinBruteMetaProperties extends AbstractPiglinMetaProperties {

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractPiglinMetaProperties.SCHEMA.extend(EntityTypes.PIGLIN_BRUTE)
        .build();

}
