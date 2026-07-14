// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Ender Man} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class EnderManMetaProperties extends MonsterMetaProperties {

    /**
     * Property representing the metadata field {@code CARRY_STATE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> CARRY_STATE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 14, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_15, 15, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_16, 15, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_16_2, 15, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_17, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_19, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_19_1, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_19_3, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_19_4, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_2, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_3, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_20_5, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_2, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_4, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_5, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_6, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_9, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_11, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_26_1, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_26_2, 16, EntityDataTypes.OPTIONAL_BLOCK_STATE)
    .build();

    /**
     * Property representing the metadata field {@code CREEPY}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> CREEPY = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 15, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code STARED_AT}
     *
     * <p>Supported Versions: {@code 1.15+}</p>
     */
    public static final SimpleProperty<Boolean> STARED_AT = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = MonsterMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(EnderManMetaProperties.CARRY_STATE)
        .add(EnderManMetaProperties.CREEPY)
        .add(EnderManMetaProperties.STARED_AT)
        .build();

}
