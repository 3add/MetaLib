// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.bitmask.view.BeeFlagsView;

/**
 * Metadata properties for the {@code Bee} meta
 * <p>Supported Versions: {@code 1.15+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Bee">Bee on the minecraft.wiki</a></p>
 */
public class BeeMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code ANGER_END_TIME}
     *
     * <p>Supported Versions: {@code 1.21.11+}</p>
     */
    public static final SimpleProperty<Long> ANGER_END_TIME = SimpleProperty.<Long>builder()
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.LONG)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.LONG)
    .build();

    /**
     * Property representing the metadata field {@code ANGER_TIME}
     *
     * <p>Supported Versions: {@code 1.15}</p>
     */
    public static final SimpleProperty<Integer> ANGER_TIME = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code FLAGS}
     *
     * <p>Wrapped by view: {@link BeeFlagsView}</p>
     * <p>Supported Versions: {@code 1.15+}</p>
     */
    public static final ViewProperty<Byte, BeeFlagsView> FLAGS = ViewProperty.builder(BeeFlagsView::new)
        .addVersion(ClientVersion.V_1_15, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code REMAINING_ANGER_TIME}
     *
     * <p>Supported Versions: {@code 1.16 - 1.21.9}</p>
     */
    public static final SimpleProperty<Integer> REMAINING_ANGER_TIME = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.BEE)
        .add(BeeMetaProperties.ANGER_END_TIME)
        .add(BeeMetaProperties.ANGER_TIME)
        .add(BeeMetaProperties.FLAGS)
        .add(BeeMetaProperties.REMAINING_ANGER_TIME)
        .build();

}
