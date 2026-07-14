// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.frog.FrogVariant;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.Optional;

/**
 * Metadata properties for the {@code Frog} meta
 * <p>Supported Versions: {@code 1.19+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Frog">Frog on the minecraft.wiki</a></p>
 */
public class FrogMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code TONGUE_TARGET}
     *
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static final SimpleProperty<Optional<Integer>> TONGUE_TARGET = SimpleProperty.<Optional<Integer>>builder()
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_INT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static final SimpleProperty<FrogVariant> VARIANT = SimpleProperty.<FrogVariant>builder()
        .addVersion(ClientVersion.V_1_19, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_19_1, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_19_3, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.TYPED_FROG_VARIANT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.TYPED_FROG_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.FROG)
        .add(FrogMetaProperties.TONGUE_TARGET)
        .add(FrogMetaProperties.VARIANT)
        .build();

}
