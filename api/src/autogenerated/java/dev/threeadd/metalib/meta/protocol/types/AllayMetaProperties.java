// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Allay} meta
 * <p>Supported Versions: {@code 1.19+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Allay">Allay on the minecraft.wiki</a></p>
 */
public class AllayMetaProperties extends PathfinderMobMetaProperties {

    /**
     * Property representing the metadata field {@code CAN_DUPLICATE}
     *
     * <p>Supported Versions: {@code 1.19.1+}</p>
     */
    public static final SimpleProperty<Boolean> CAN_DUPLICATE = SimpleProperty.<Boolean>builder()
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
     * Property representing the metadata field {@code DANCING}
     *
     * <p>Supported Versions: {@code 1.19.1+}</p>
     */
    public static final SimpleProperty<Boolean> DANCING = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_19_1, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 16, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = PathfinderMobMetaProperties.SCHEMA.extend(EntityTypes.ALLAY)
        .add(AllayMetaProperties.CAN_DUPLICATE)
        .add(AllayMetaProperties.DANCING)
        .build();

}
