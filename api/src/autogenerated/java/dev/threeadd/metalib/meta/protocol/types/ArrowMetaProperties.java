// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Arrow} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Arrow">Arrow on the minecraft.wiki</a></p>
 */
public class ArrowMetaProperties extends AbstractArrowMetaProperties {

    /**
     * Property representing the metadata field {@code ID_EFFECT_COLOR}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> ID_EFFECT_COLOR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 11, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractArrowMetaProperties.SCHEMA.extend(EntityTypes.ARROW)
        .add(ArrowMetaProperties.ID_EFFECT_COLOR)
        .build();

}
