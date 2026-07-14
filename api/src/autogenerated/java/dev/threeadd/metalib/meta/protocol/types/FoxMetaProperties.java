// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.Optional;
import java.util.UUID;

/**
 * Metadata properties for the {@code Fox} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Fox">Fox on the minecraft.wiki</a></p>
 */
public class FoxMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code FLAGS}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Byte> FLAGS = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code TRUSTED_0}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Optional<UUID>> TRUSTED_0 = SimpleProperty.<Optional<UUID>>builder()
        .addVersion(ClientVersion.V_1_14_4, 17, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_15, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_16, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_16_2, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_17, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_1, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_3, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.OPTIONAL_UUID)
    .build();

    /**
     * Property representing the metadata field {@code TRUSTED_1}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Optional<UUID>> TRUSTED_1 = SimpleProperty.<Optional<UUID>>builder()
        .addVersion(ClientVersion.V_1_14_4, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_15, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_16, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_16_2, 19, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_17, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_1, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_3, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_4, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_20_2, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_20_3, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_20_5, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_2, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_4, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_5, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_6, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_9, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_26_1, 21, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_26_2, 21, EntityDataTypes.OPTIONAL_UUID)
    .build();

    /**
     * Property representing the metadata field {@code TYPE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> TYPE = SimpleProperty.<Integer>builder()
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
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.FOX)
        .add(FoxMetaProperties.FLAGS)
        .add(FoxMetaProperties.TRUSTED_0)
        .add(FoxMetaProperties.TRUSTED_1)
        .add(FoxMetaProperties.TYPE)
        .build();

}
