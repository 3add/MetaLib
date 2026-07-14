// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import dev.threeadd.metalib.meta.MetadataSchema;

/**
 * Metadata properties for the {@code Wind Charge} meta
 * <p>Supported Versions: {@code 1.20.3+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wind_Charge">Wind Charge on the minecraft.wiki</a></p>
 */
public class WindChargeMetaProperties extends AbstractWindChargeMetaProperties {

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractWindChargeMetaProperties.SCHEMA.extend(EntityTypes.WIND_CHARGE)
        .build();

}
