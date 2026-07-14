// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.entity.villager.VillagerData;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Villager} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Villager">Villager on the minecraft.wiki</a></p>
 */
public class VillagerMetaProperties extends AbstractVillagerMetaProperties {

    /**
     * Property representing the metadata field {@code VILLAGER_DATA}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<VillagerData> VILLAGER_DATA = SimpleProperty.<VillagerData>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.VILLAGER_DATA)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.VILLAGER_DATA)
    .build();

    /**
     * Property representing the metadata field {@code VILLAGER_FINALIZED}
     *
     * <p>Supported Versions: {@code 26.1+}</p>
     */
    public static final SimpleProperty<Boolean> VILLAGER_FINALIZED = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractVillagerMetaProperties.SCHEMA.extend(EntityTypes.VILLAGER)
        .add(VillagerMetaProperties.VILLAGER_DATA)
        .add(VillagerMetaProperties.VILLAGER_FINALIZED)
        .build();

}
