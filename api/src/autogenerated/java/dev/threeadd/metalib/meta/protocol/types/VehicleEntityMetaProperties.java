// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Vehicle Entity} meta
 * <p>Supported Versions: {@code 1.20.3+}</p>
 */
public class VehicleEntityMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code DAMAGE}
     *
     * <p>Supported Versions: {@code 1.20.3+}</p>
     */
    public static final SimpleProperty<Float> DAMAGE = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 10, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 10, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code HURT}
     *
     * <p>Supported Versions: {@code 1.20.3+}</p>
     */
    public static final SimpleProperty<Integer> HURT = SimpleProperty.<Integer>builder()
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
     * Property representing the metadata field {@code HURTDIR}
     *
     * <p>Supported Versions: {@code 1.20.3+}</p>
     */
    public static final SimpleProperty<Integer> HURTDIR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(VehicleEntityMetaProperties.DAMAGE)
        .add(VehicleEntityMetaProperties.HURT)
        .add(VehicleEntityMetaProperties.HURTDIR)
        .build();

}
