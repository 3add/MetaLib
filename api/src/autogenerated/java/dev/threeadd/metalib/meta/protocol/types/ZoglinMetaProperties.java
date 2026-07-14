// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Zoglin} meta
 * <p>Supported Versions: {@code 1.16+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zoglin">Zoglin on the minecraft.wiki</a></p>
 */
public class ZoglinMetaProperties extends MonsterMetaProperties {

    /**
     * Property representing the metadata field {@code BABY}
     *
     * <p>Supported Versions: {@code 1.16+}</p>
     */
    public static final SimpleProperty<Boolean> BABY = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_16, 15, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 16, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 16, EntityDataTypes.BOOLEAN)
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
    public static final MetadataSchema SCHEMA = MonsterMetaProperties.SCHEMA.extend(EntityTypes.ZOGLIN)
        .add(ZoglinMetaProperties.BABY)
        .build();

}
