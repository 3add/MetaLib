// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Primed Tnt} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class PrimedTntMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code BLOCK_STATE}
     *
     * <p>Supported Versions: {@code 1.20.3+}</p>
     */
    public static final SimpleProperty<Integer> BLOCK_STATE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.BLOCK_STATE)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.BLOCK_STATE)
    .build();

    /**
     * Property representing the metadata field {@code FUSE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> FUSE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.PRIMED_TNT)
        .add(PrimedTntMetaProperties.BLOCK_STATE)
        .add(PrimedTntMetaProperties.FUSE)
        .build();

}
