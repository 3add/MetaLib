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
 * Metadata properties for the {@code End Crystal} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#End_Crystal">End Crystal on the minecraft.wiki</a></p>
 */
public class EndCrystalMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code BEAM_TARGET}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Optional<Vector3i>> BEAM_TARGET = SimpleProperty.<Optional<Vector3i>>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
    .build();

    /**
     * Property representing the metadata field {@code SHOW_BOTTOM}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> SHOW_BOTTOM = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.END_CRYSTAL)
        .add(EndCrystalMetaProperties.BEAM_TARGET)
        .add(EndCrystalMetaProperties.SHOW_BOTTOM)
        .build();

}
