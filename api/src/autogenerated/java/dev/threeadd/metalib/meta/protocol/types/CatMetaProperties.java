// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.cat.CatSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.cat.CatVariant;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Cat} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Cat">Cat on the minecraft.wiki</a></p>
 */
public class CatMetaProperties extends TamableAnimalMetaProperties {

    /**
     * Property representing the metadata field {@code COLLAR_COLOR}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> COLLAR_COLOR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 23, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 23, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code IS_LYING}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> IS_LYING = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 21, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code RELAX_STATE_ONE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> RELAX_STATE_ONE = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 21, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 22, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 22, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code SOUND_VARIANT}
     *
     * <p>Supported Versions: {@code 26.1+}</p>
     */
    public static final SimpleProperty<CatSoundVariant> SOUND_VARIANT = SimpleProperty.<CatSoundVariant>builder()
        .addVersion(ClientVersion.V_26_1, 24, EntityDataTypes.CAT_SOUND_VARIANT)
        .addVersion(ClientVersion.V_26_2, 24, EntityDataTypes.CAT_SOUND_VARIANT)
    .build();

    /**
     * Property representing the metadata field {@code TYPE}
     *
     * <p>Supported Versions: {@code 1.17-}</p>
     */
    public static final SimpleProperty<Integer> TYPE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 19, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static final SimpleProperty<CatVariant> VARIANT = SimpleProperty.<CatVariant>builder()
        .addVersion(ClientVersion.V_1_19, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_19_1, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_19_3, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.TYPED_CAT_VARIANT)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.TYPED_CAT_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = TamableAnimalMetaProperties.SCHEMA.extend(EntityTypes.CAT)
        .add(CatMetaProperties.COLLAR_COLOR)
        .add(CatMetaProperties.IS_LYING)
        .add(CatMetaProperties.RELAX_STATE_ONE)
        .add(CatMetaProperties.SOUND_VARIANT)
        .add(CatMetaProperties.TYPE)
        .add(CatMetaProperties.VARIANT)
        .build();

}
