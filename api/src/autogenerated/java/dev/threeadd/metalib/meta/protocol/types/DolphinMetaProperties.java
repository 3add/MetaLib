// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.util.Vector3i;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Dolphin} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Dolphin">Dolphin on the minecraft.wiki</a></p>
 */
public class DolphinMetaProperties extends AgeableWaterCreatureMetaProperties {

    /**
     * Property representing the metadata field {@code GOT_FISH}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> GOT_FISH = SimpleProperty.<Boolean>builder()
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
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code MOISNTESS_LEVEL}
     *
     * <p>Supported Versions: {@code 1.15-}</p>
     */
    public static final SimpleProperty<Integer> MOISNTESS_LEVEL = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code MOISTNESS_LEVEL}
     *
     * <p>Supported Versions: {@code 1.16+}</p>
     */
    public static final SimpleProperty<Integer> MOISTNESS_LEVEL = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code TREASURE_POS}
     *
     * <p>Supported Versions: {@code 1.21.4-}</p>
     */
    public static final SimpleProperty<Vector3i> TREASURE_POS = SimpleProperty.<Vector3i>builder()
        .addVersion(ClientVersion.V_1_14_4, 14, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_15, 15, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16, 15, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16_2, 15, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_17, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_1, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_3, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_4, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_2, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_3, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_5, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21, 16, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.BLOCK_POSITION)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AgeableWaterCreatureMetaProperties.SCHEMA.extend(EntityTypes.DOLPHIN)
        .add(DolphinMetaProperties.GOT_FISH)
        .add(DolphinMetaProperties.MOISNTESS_LEVEL)
        .add(DolphinMetaProperties.MOISTNESS_LEVEL)
        .add(DolphinMetaProperties.TREASURE_POS)
        .build();

}
