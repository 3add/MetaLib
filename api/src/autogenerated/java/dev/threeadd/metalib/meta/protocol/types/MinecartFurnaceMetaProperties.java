// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Minecart Furnace} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class MinecartFurnaceMetaProperties extends AbstractMinecartMetaProperties {

    /**
     * Property representing the metadata field {@code FUEL}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> FUEL = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 13, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 13, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractMinecartMetaProperties.SCHEMA.extend(EntityTypes.MINECART_FURNACE)
        .add(MinecartFurnaceMetaProperties.FUEL)
        .build();

}
