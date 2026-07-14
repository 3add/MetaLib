// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.sniffer.SnifferState;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Sniffer} meta
 * <p>Supported Versions: {@code 1.19.4+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Sniffer">Sniffer on the minecraft.wiki</a></p>
 */
public class SnifferMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code DROP_SEED_AT_TICK}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Integer> DROP_SEED_AT_TICK = SimpleProperty.<Integer>builder()
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
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code STATE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<SnifferState> STATE = SimpleProperty.<SnifferState>builder()
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.SNIFFER_STATE)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.SNIFFER_STATE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.SNIFFER)
        .add(SnifferMetaProperties.DROP_SEED_AT_TICK)
        .add(SnifferMetaProperties.STATE)
        .build();

}
