// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Boat} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Boat">Boat on the minecraft.wiki</a></p>
 */
public class BoatMetaProperties extends AbstractBoatMetaProperties {

    /**
     * Property representing the metadata field {@code BUBBLE_TIME}
     *
     * <p>Supported Versions: {@code 1.21-}</p>
     */
    public static final SimpleProperty<Integer> BUBBLE_TIME = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 14, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 14, EntityDataTypes.INT)
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
     * Property representing the metadata field {@code PADDLE_LEFT}
     *
     * <p>Supported Versions: {@code 1.21-}</p>
     */
    public static final SimpleProperty<Boolean> PADDLE_LEFT = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 12, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code PADDLE_RIGHT}
     *
     * <p>Supported Versions: {@code 1.21-}</p>
     */
    public static final SimpleProperty<Boolean> PADDLE_RIGHT = SimpleProperty.<Boolean>builder()
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
    .build();

    /**
     * Property representing the metadata field {@code TYPE}
     *
     * <p>Supported Versions: {@code 1.21-}</p>
     */
    public static final SimpleProperty<Integer> TYPE = SimpleProperty.<Integer>builder()
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
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractBoatMetaProperties.SCHEMA.extend(EntityTypes.BOAT)
        .add(BoatMetaProperties.BUBBLE_TIME)
        .add(BoatMetaProperties.DAMAGE)
        .add(BoatMetaProperties.HURT)
        .add(BoatMetaProperties.HURTDIR)
        .add(BoatMetaProperties.PADDLE_LEFT)
        .add(BoatMetaProperties.PADDLE_RIGHT)
        .add(BoatMetaProperties.TYPE)
        .build();

}
