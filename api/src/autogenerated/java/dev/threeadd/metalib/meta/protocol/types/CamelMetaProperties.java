// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Camel} meta
 * <p>Supported Versions: {@code 1.19.3+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Camel">Camel on the minecraft.wiki</a></p>
 */
public class CamelMetaProperties extends AbstractHorseMetaProperties {

    /**
     * Property representing the metadata field {@code DASH}
     *
     * <p>Supported Versions: {@code 1.19.3+}</p>
     */
    public static final SimpleProperty<Boolean> DASH = SimpleProperty.<Boolean>builder()
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
     * Property representing the metadata field {@code LAST_POSE_CHANGE_TICK}
     *
     * <p>Supported Versions: {@code 1.19.3+}</p>
     */
    public static final SimpleProperty<Long> LAST_POSE_CHANGE_TICK = SimpleProperty.<Long>builder()
        .addVersion(ClientVersion.V_1_19_3, 20, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.LONG)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractHorseMetaProperties.SCHEMA.extend(EntityTypes.CAMEL)
        .add(CamelMetaProperties.DASH)
        .add(CamelMetaProperties.LAST_POSE_CHANGE_TICK)
        .build();

}
