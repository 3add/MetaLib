// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.util.Vector3i;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Falling Block Entity} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class FallingBlockEntityMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code START_POS}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Vector3i> START_POS = SimpleProperty.<Vector3i>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.BLOCK_POSITION)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(FallingBlockEntityMetaProperties.START_POS)
        .build();

}
