// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import dev.threeadd.metalib.meta.MetadataSchema;

/**
 * Metadata properties for the {@code Breeze} meta
 * <p>Supported Versions: {@code 1.20.3+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Breeze">Breeze on the minecraft.wiki</a></p>
 */
public class BreezeMetaProperties extends MonsterMetaProperties {

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = MonsterMetaProperties.SCHEMA.extend(EntityTypes.BREEZE)
        .build();

}
