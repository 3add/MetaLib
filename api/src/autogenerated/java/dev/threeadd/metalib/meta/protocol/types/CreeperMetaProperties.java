// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.enums.view.CreeperSwellStateView;

/**
 * Metadata properties for the {@code Creeper} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Creeper">Creeper on the minecraft.wiki</a></p>
 */
public class CreeperMetaProperties extends MonsterMetaProperties {

    /**
     * Property representing the metadata field {@code IS_IGNITED}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> IS_IGNITED = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.BOOLEAN)
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
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code IS_POWERED}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> IS_POWERED = SimpleProperty.<Boolean>builder()
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
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code SWELL_DIR}
     *
     * <p>Wrapped by view: {@link CreeperSwellStateView}</p>
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final ViewProperty<Integer, CreeperSwellStateView> SWELL_DIR = ViewProperty.builder(CreeperSwellStateView::new)
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
        .addVersion(ClientVersion.V_1_21_9, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 16, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = MonsterMetaProperties.SCHEMA.extend(EntityTypes.CREEPER)
        .add(CreeperMetaProperties.IS_IGNITED)
        .add(CreeperMetaProperties.IS_POWERED)
        .add(CreeperMetaProperties.SWELL_DIR)
        .build();

}
