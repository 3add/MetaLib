// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Mob} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Mob">Mob on the minecraft.wiki</a></p>
 */
public class MobMetaProperties extends LivingEntityMetaProperties {

    /**
     * Property representing the metadata field {@code MOB_FLAGS}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Byte> MOB_FLAGS = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 13, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 14, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 14, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 14, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 15, EntityDataTypes.BYTE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = LivingEntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(MobMetaProperties.MOB_FLAGS)
        .build();

}
