// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.wolfvariant.WolfVariant;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Wolf} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Wolf">Wolf on the minecraft.wiki</a></p>
 */
public class WolfMetaProperties extends TamableAnimalMetaProperties {

    /**
     * Property representing the metadata field {@code ANGER_END_TIME}
     *
     * <p>Supported Versions: {@code 1.21.11+}</p>
     */
    public static final SimpleProperty<Long> ANGER_END_TIME = SimpleProperty.<Long>builder()
        .addVersion(ClientVersion.V_1_21_11, 21, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_26_1, 22, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_26_2, 22, EntityDataTypes.LONG)
    .build();

    /**
     * Property representing the metadata field {@code COLLAR_COLOR}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> COLLAR_COLOR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 21, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code HEALTH}
     *
     * <p>Supported Versions: {@code 1.14.4-}</p>
     */
    public static final SimpleProperty<Float> HEALTH = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_14_4, 17, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code INTERESTED}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> INTERESTED = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code REMAINING_ANGER_TIME}
     *
     * <p>Supported Versions: {@code 1.16 - 1.21.9}</p>
     */
    public static final SimpleProperty<Integer> REMAINING_ANGER_TIME = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_16, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 21, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code SOUND_VARIANT}
     *
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static final SimpleProperty<WolfSoundVariant> SOUND_VARIANT = SimpleProperty.<WolfSoundVariant>builder()
        .addVersion(ClientVersion.V_1_21_5, 23, EntityDataTypes.WOLF_SOUND_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 23, EntityDataTypes.WOLF_SOUND_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 23, EntityDataTypes.WOLF_SOUND_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 23, EntityDataTypes.WOLF_SOUND_VARIANT)
        .addVersion(ClientVersion.V_26_1, 24, EntityDataTypes.WOLF_SOUND_VARIANT)
        .addVersion(ClientVersion.V_26_2, 24, EntityDataTypes.WOLF_SOUND_VARIANT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.20.5+}</p>
     */
    public static final SimpleProperty<WolfVariant> VARIANT = SimpleProperty.<WolfVariant>builder()
        .addVersion(ClientVersion.V_1_20_5, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21_2, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21_4, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21_5, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 22, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_26_1, 23, EntityDataTypes.TYPED_WOLF_VARIANT)
        .addVersion(ClientVersion.V_26_2, 23, EntityDataTypes.TYPED_WOLF_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = TamableAnimalMetaProperties.SCHEMA.extend(EntityTypes.WOLF)
        .add(WolfMetaProperties.ANGER_END_TIME)
        .add(WolfMetaProperties.COLLAR_COLOR)
        .add(WolfMetaProperties.HEALTH)
        .add(WolfMetaProperties.INTERESTED)
        .add(WolfMetaProperties.REMAINING_ANGER_TIME)
        .add(WolfMetaProperties.SOUND_VARIANT)
        .add(WolfMetaProperties.VARIANT)
        .build();

}
