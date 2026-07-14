// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import dev.threeadd.metalib.meta.MetadataSchema;

/**
 * Metadata properties for the {@code Glow Item Frame} meta
 * <p>Supported Versions: {@code 1.17+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Glow_Item_Frame">Glow Item Frame on the minecraft.wiki</a></p>
 */
public class GlowItemFrameMetaProperties extends ItemFrameMetaProperties {

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = ItemFrameMetaProperties.SCHEMA.extend(EntityTypes.GLOW_ITEM_FRAME)
        .build();

}
