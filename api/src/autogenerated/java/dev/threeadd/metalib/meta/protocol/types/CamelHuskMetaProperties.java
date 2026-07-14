// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import dev.threeadd.metalib.meta.MetadataSchema;

/**
 * Metadata properties for the {@code Camel Husk} meta
 * <p>Supported Versions: {@code 1.21.11+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Camel_Husk">Camel Husk on the minecraft.wiki</a></p>
 */
public class CamelHuskMetaProperties extends CamelMetaProperties {

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = CamelMetaProperties.SCHEMA.extend(EntityTypes.CAMEL_HUSK)
        .build();

}
