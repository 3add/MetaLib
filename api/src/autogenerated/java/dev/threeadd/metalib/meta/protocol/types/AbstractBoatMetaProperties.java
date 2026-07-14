// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Abstract Boat} meta
 * <p>Supported Versions: {@code 1.21.2+}</p>
 */
public class AbstractBoatMetaProperties extends VehicleEntityMetaProperties {

    /**
     * Property representing the metadata field {@code BUBBLE_TIME}
     *
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final SimpleProperty<Integer> BUBBLE_TIME = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_21_2, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 13, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code PADDLE_LEFT}
     *
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final SimpleProperty<Boolean> PADDLE_LEFT = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_2, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 11, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code PADDLE_RIGHT}
     *
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final SimpleProperty<Boolean> PADDLE_RIGHT = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_2, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 12, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 12, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = VehicleEntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(AbstractBoatMetaProperties.BUBBLE_TIME)
        .add(AbstractBoatMetaProperties.PADDLE_LEFT)
        .add(AbstractBoatMetaProperties.PADDLE_RIGHT)
        .build();

}
