// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Glow Squid} meta
 * <p>Supported Versions: {@code 1.17+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Glow_Squid">Glow Squid on the minecraft.wiki</a></p>
 */
public class GlowSquidMetaProperties extends SquidMetaProperties {

    /**
     * Property representing the metadata field {@code DARK_TICKS_REMAINING}
     *
     * <p>Supported Versions: {@code 1.17+}</p>
     */
    public static final SimpleProperty<Integer> DARK_TICKS_REMAINING = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_17, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = SquidMetaProperties.SCHEMA.extend(EntityTypes.GLOW_SQUID)
        .add(GlowSquidMetaProperties.DARK_TICKS_REMAINING)
        .build();

}
