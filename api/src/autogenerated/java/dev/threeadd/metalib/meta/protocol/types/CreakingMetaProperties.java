// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.util.Vector3i;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.Optional;

/**
 * Metadata properties for the {@code Creaking} meta
 * <p>Supported Versions: {@code 1.21.2+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Creaking">Creaking on the minecraft.wiki</a></p>
 */
public class CreakingMetaProperties extends MonsterMetaProperties {

    /**
     * Property representing the metadata field {@code CAN_MOVE}
     *
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final SimpleProperty<Boolean> CAN_MOVE = SimpleProperty.<Boolean>builder()
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
     * Property representing the metadata field {@code HOME_POS}
     *
     * <p>Supported Versions: {@code 1.21.4+}</p>
     */
    public static final SimpleProperty<Optional<Vector3i>> HOME_POS = SimpleProperty.<Optional<Vector3i>>builder()
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
    .build();

    /**
     * Property representing the metadata field {@code IS_ACTIVE}
     *
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final SimpleProperty<Boolean> IS_ACTIVE = SimpleProperty.<Boolean>builder()
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
     * Property representing the metadata field {@code IS_TEARING_DOWN}
     *
     * <p>Supported Versions: {@code 1.21.4+}</p>
     */
    public static final SimpleProperty<Boolean> IS_TEARING_DOWN = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = MonsterMetaProperties.SCHEMA.extend(EntityTypes.CREAKING)
        .add(CreakingMetaProperties.CAN_MOVE)
        .add(CreakingMetaProperties.HOME_POS)
        .add(CreakingMetaProperties.IS_ACTIVE)
        .add(CreakingMetaProperties.IS_TEARING_DOWN)
        .build();

}
