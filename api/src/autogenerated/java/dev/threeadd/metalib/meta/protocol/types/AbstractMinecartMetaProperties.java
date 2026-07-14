// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Abstract Minecart} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Minecart">Abstract Minecart on the minecraft.wiki</a></p>
 */
public class AbstractMinecartMetaProperties extends VehicleEntityMetaProperties {

    /**
     * Property representing the metadata field {@code CUSTOM_DISPLAY}
     *
     * <p>Supported Versions: {@code 1.21.4-}</p>
     */
    public static final SimpleProperty<Boolean> CUSTOM_DISPLAY = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 13, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code CUSTOM_DISPLAY_BLOCK}
     *
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static final SimpleProperty<Integer> CUSTOM_DISPLAY_BLOCK = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_21_5, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_6, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_9, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_1_21_11, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_26_1, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
        .addVersion(ClientVersion.V_26_2, 11, EntityDataTypes.OPTIONAL_BLOCK_STATE)
    .build();

    /**
     * Property representing the metadata field {@code DAMAGE}
     *
     * <p>Supported Versions: {@code 1.20.2-}</p>
     */
    public static final SimpleProperty<Float> DAMAGE = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_14_4, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_15, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16_2, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_17, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_1, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_3, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code DISPLAY_BLOCK}
     *
     * <p>Supported Versions: {@code 1.21.4-}</p>
     */
    public static final SimpleProperty<Integer> DISPLAY_BLOCK = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 11, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code DISPLAY_OFFSET}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> DISPLAY_OFFSET = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 12, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code HURT}
     *
     * <p>Supported Versions: {@code 1.20.2-}</p>
     */
    public static final SimpleProperty<Integer> HURT = SimpleProperty.<Integer>builder()
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
    .build();

    /**
     * Property representing the metadata field {@code HURTDIR}
     *
     * <p>Supported Versions: {@code 1.20.2-}</p>
     */
    public static final SimpleProperty<Integer> HURTDIR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = VehicleEntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(AbstractMinecartMetaProperties.CUSTOM_DISPLAY)
        .add(AbstractMinecartMetaProperties.CUSTOM_DISPLAY_BLOCK)
        .add(AbstractMinecartMetaProperties.DAMAGE)
        .add(AbstractMinecartMetaProperties.DISPLAY_BLOCK)
        .add(AbstractMinecartMetaProperties.DISPLAY_OFFSET)
        .add(AbstractMinecartMetaProperties.HURT)
        .add(AbstractMinecartMetaProperties.HURTDIR)
        .build();

}
