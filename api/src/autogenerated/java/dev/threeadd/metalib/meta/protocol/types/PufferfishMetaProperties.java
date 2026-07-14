// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Pufferfish} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Pufferfish">Pufferfish on the minecraft.wiki</a></p>
 */
public class PufferfishMetaProperties extends AbstractFishMetaProperties {

    /**
     * Property representing the metadata field {@code PUFF_STATE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> PUFF_STATE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 15, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractFishMetaProperties.SCHEMA.extend(EntityTypes.PUFFERFISH)
        .add(PufferfishMetaProperties.PUFF_STATE)
        .build();

}
