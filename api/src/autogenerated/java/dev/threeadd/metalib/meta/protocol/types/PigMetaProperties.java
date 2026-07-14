// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.pig.PigSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.pig.PigVariant;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Pig} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Pig">Pig on the minecraft.wiki</a></p>
 */
public class PigMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code BOOST_TIME}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> BOOST_TIME = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.INT)
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
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code SADDLE}
     *
     * <p>Supported Versions: {@code 1.21.4-}</p>
     */
    public static final SimpleProperty<Boolean> SADDLE = SimpleProperty.<Boolean>builder()
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
    .build();

    /**
     * Property representing the metadata field {@code SOUND_VARIANT}
     *
     * <p>Supported Versions: {@code 26.1+}</p>
     */
    public static final SimpleProperty<PigSoundVariant> SOUND_VARIANT = SimpleProperty.<PigSoundVariant>builder()
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.PIG_SOUND_VARIANT)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.PIG_SOUND_VARIANT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static final SimpleProperty<PigVariant> VARIANT = SimpleProperty.<PigVariant>builder()
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.PIG_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.PIG_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.PIG_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.PIG_VARIANT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.PIG_VARIANT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.PIG_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.PIG)
        .add(PigMetaProperties.BOOST_TIME)
        .add(PigMetaProperties.SADDLE)
        .add(PigMetaProperties.SOUND_VARIANT)
        .add(PigMetaProperties.VARIANT)
        .build();

}
