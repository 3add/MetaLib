// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.Optional;

/**
 * Metadata properties for the {@code Player} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Player">Player on the minecraft.wiki</a></p>
 */
public class PlayerMetaProperties extends AvatarMetaProperties {

    /**
     * Property representing the metadata field {@code PLAYER_ABSORPTION}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Float> PLAYER_ABSORPTION = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_14_4, 13, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_15, 14, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16, 14, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16_2, 14, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_17, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_1, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_3, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_4, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 15, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code PLAYER_MAIN_HAND}
     *
     * <p>Supported Versions: {@code 1.21.6-}</p>
     */
    public static final SimpleProperty<Byte> PLAYER_MAIN_HAND = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code PLAYER_MODE_CUSTOMISATION}
     *
     * <p>Supported Versions: {@code 1.21.6-}</p>
     */
    public static final SimpleProperty<Byte> PLAYER_MODE_CUSTOMISATION = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code SCORE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> SCORE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 15, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 15, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 15, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code SHOULDER_LEFT}
     *
     * <p>Supported Versions: {@code 1.21.6-}</p>
     */
    public static final SimpleProperty<NBTCompound> SHOULDER_LEFT = SimpleProperty.<NBTCompound>builder()
        .addVersion(ClientVersion.V_1_14_4, 17, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_15, 18, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_16, 18, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_16_2, 18, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_17, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19_1, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19_3, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.NBT)
    .build();

    /**
     * Property representing the metadata field {@code SHOULDER_PARROT_LEFT}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<Optional<Integer>> SHOULDER_PARROT_LEFT = SimpleProperty.<Optional<Integer>>builder()
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_INT)
    .build();

    /**
     * Property representing the metadata field {@code SHOULDER_PARROT_RIGHT}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<Optional<Integer>> SHOULDER_PARROT_RIGHT = SimpleProperty.<Optional<Integer>>builder()
        .addVersion(ClientVersion.V_1_21_9, 20, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.OPTIONAL_INT)
    .build();

    /**
     * Property representing the metadata field {@code SHOULDER_RIGHT}
     *
     * <p>Supported Versions: {@code 1.21.6-}</p>
     */
    public static final SimpleProperty<NBTCompound> SHOULDER_RIGHT = SimpleProperty.<NBTCompound>builder()
        .addVersion(ClientVersion.V_1_14_4, 18, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_15, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_16, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_16_2, 19, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_17, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19_1, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19_3, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_19_4, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_20_2, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_20_3, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_20_5, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_2, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_4, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_5, 20, EntityDataTypes.NBT)
        .addVersion(ClientVersion.V_1_21_6, 20, EntityDataTypes.NBT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AvatarMetaProperties.SCHEMA.extend(EntityTypes.PLAYER)
        .add(PlayerMetaProperties.PLAYER_ABSORPTION)
        .add(PlayerMetaProperties.PLAYER_MAIN_HAND)
        .add(PlayerMetaProperties.PLAYER_MODE_CUSTOMISATION)
        .add(PlayerMetaProperties.SCORE)
        .add(PlayerMetaProperties.SHOULDER_LEFT)
        .add(PlayerMetaProperties.SHOULDER_PARROT_LEFT)
        .add(PlayerMetaProperties.SHOULDER_PARROT_RIGHT)
        .add(PlayerMetaProperties.SHOULDER_RIGHT)
        .build();

}
