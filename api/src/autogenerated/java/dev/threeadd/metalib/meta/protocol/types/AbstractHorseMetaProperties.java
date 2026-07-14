// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.bitmask.view.AbstractHorseFlagsView;
import java.util.Optional;
import java.util.UUID;

/**
 * Metadata properties for the {@code Abstract Horse} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Horse">Abstract Horse on the minecraft.wiki</a></p>
 */
public class AbstractHorseMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code FLAGS}
     *
     * <p>Wrapped by view: {@link AbstractHorseFlagsView}</p>
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final ViewProperty<Byte, AbstractHorseFlagsView> FLAGS = ViewProperty.builder(AbstractHorseFlagsView::new)
        .addVersion(ClientVersion.V_1_14_4, 15, EntityDataTypes.BYTE)
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
     * Property representing the metadata field {@code OWNER_UUID}
     *
     * <p>Supported Versions: {@code 1.19.3-}</p>
     */
    public static final SimpleProperty<Optional<UUID>> OWNER_UUID = SimpleProperty.<Optional<UUID>>builder()
        .addVersion(ClientVersion.V_1_14_4, 16, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_15, 17, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_16, 17, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_16_2, 17, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_17, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.OPTIONAL_UUID)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.ABSTRACT_HORSE)
        .add(AbstractHorseMetaProperties.FLAGS)
        .add(AbstractHorseMetaProperties.OWNER_UUID)
        .build();

}
