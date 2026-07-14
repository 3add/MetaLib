// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import net.kyori.adventure.text.Component;

/**
 * Metadata properties for the {@code Minecart Command Block} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class MinecartCommandBlockMetaProperties extends AbstractMinecartMetaProperties {

    /**
     * Property representing the metadata field {@code COMMAND_NAME}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<String> COMMAND_NAME = SimpleProperty.<String>builder()
        .addVersion(ClientVersion.V_1_14_4, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_15, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_16, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_16_2, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_17, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_19, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_19_1, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_19_3, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_19_4, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_20_2, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_20_3, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_20_5, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21_2, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21_4, 14, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21_5, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21_6, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21_9, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_1_21_11, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_26_1, 13, EntityDataTypes.STRING)
        .addVersion(ClientVersion.V_26_2, 13, EntityDataTypes.STRING)
    .build();

    /**
     * Property representing the metadata field {@code LAST_OUTPUT}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Component> LAST_OUTPUT = SimpleProperty.<Component>builder()
        .addVersion(ClientVersion.V_1_14_4, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_15, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_16, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_16_2, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_17, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19_1, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19_3, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19_4, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_2, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_3, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_5, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_2, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_4, 15, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_5, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_6, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_9, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_11, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_1, 14, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_2, 14, EntityDataTypes.ADV_COMPONENT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractMinecartMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(MinecartCommandBlockMetaProperties.COMMAND_NAME)
        .add(MinecartCommandBlockMetaProperties.LAST_OUTPUT)
        .build();

}
