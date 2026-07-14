// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Block Display} meta
 * <p>Supported Versions: {@code 1.19.4+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Block_Display">Block Display on the minecraft.wiki</a></p>
 */
public class BlockDisplayMetaProperties extends DisplayMetaProperties {

    /**
     * Property representing the metadata field {@code BLOCK_STATE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Integer> BLOCK_STATE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 22, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_2, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_3, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_5, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_2, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_4, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_5, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_6, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_9, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_11, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_26_1, 23, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_26_2, 23, EntityDataTypes.BLOCK_STATE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = DisplayMetaProperties.SCHEMA.extend(EntityTypes.BLOCK_DISPLAY)
        .add(BlockDisplayMetaProperties.BLOCK_STATE)
        .build();

}
