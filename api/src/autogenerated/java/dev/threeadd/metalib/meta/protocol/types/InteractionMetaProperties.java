// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Interaction} meta
 * <p>Supported Versions: {@code 1.19.4+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Interaction">Interaction on the minecraft.wiki</a></p>
 */
public class InteractionMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code HEIGHT}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> HEIGHT = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code RESPONSE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Boolean> RESPONSE = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 10, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code WIDTH}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> WIDTH = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.FLOAT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.INTERACTION)
        .add(InteractionMetaProperties.HEIGHT)
        .add(InteractionMetaProperties.RESPONSE)
        .add(InteractionMetaProperties.WIDTH)
        .build();

}
