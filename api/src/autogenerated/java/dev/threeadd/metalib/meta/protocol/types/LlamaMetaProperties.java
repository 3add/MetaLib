// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Llama} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Llama">Llama on the minecraft.wiki</a></p>
 */
public class LlamaMetaProperties extends AbstractChestedHorseMetaProperties {

    /**
     * Property representing the metadata field {@code STRENGTH}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> STRENGTH = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code SWAG}
     *
     * <p>Supported Versions: {@code 1.20.3-}</p>
     */
    public static final SimpleProperty<Integer> SWAG = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 19, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 20, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> VARIANT = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 21, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractChestedHorseMetaProperties.SCHEMA.extend(EntityTypes.LLAMA)
        .add(LlamaMetaProperties.STRENGTH)
        .add(LlamaMetaProperties.SWAG)
        .add(LlamaMetaProperties.VARIANT)
        .build();

}
