// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Thrown Trident} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class ThrownTridentMetaProperties extends AbstractArrowMetaProperties {

    /**
     * Property representing the metadata field {@code ID_FOIL}
     *
     * <p>Supported Versions: {@code 1.15+}</p>
     */
    public static final SimpleProperty<Boolean> ID_FOIL = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_15, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 11, EntityDataTypes.BOOLEAN)
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
     * Property representing the metadata field {@code ID_LOYALTY}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Byte> ID_LOYALTY = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 11, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 11, EntityDataTypes.BYTE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractArrowMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(ThrownTridentMetaProperties.ID_FOIL)
        .add(ThrownTridentMetaProperties.ID_LOYALTY)
        .build();

}
