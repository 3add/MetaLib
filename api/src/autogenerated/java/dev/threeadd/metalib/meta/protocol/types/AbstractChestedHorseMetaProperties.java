// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Abstract Chested Horse} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class AbstractChestedHorseMetaProperties extends AbstractHorseMetaProperties {

    /**
     * Property representing the metadata field {@code CHEST}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> CHEST = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractHorseMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(AbstractChestedHorseMetaProperties.CHEST)
        .build();

}
