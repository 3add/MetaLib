// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.protocol.world.BlockFace;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Hanging Entity} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class HangingEntityMetaProperties extends BlockAttachedEntityMetaProperties {

    /**
     * Property representing the metadata field {@code DIRECTION}
     *
     * <p>Supported Versions: {@code 1.21.6+}</p>
     */
    public static final SimpleProperty<BlockFace> DIRECTION = SimpleProperty.<BlockFace>builder()
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.BLOCK_FACE)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.BLOCK_FACE)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.BLOCK_FACE)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.BLOCK_FACE)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.BLOCK_FACE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = BlockAttachedEntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(HangingEntityMetaProperties.DIRECTION)
        .build();

}
