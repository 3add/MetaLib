// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.bitmask.view.AbstractArrowIdFlagsView;
import java.util.Optional;
import java.util.UUID;

/**
 * Metadata properties for the {@code Abstract Arrow} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Arrow">Abstract Arrow on the minecraft.wiki</a></p>
 */
public class AbstractArrowMetaProperties extends ProjectileMetaProperties {

    /**
     * Property representing the metadata field {@code ID_FLAGS}
     *
     * <p>Wrapped by view: {@link AbstractArrowIdFlagsView}</p>
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final ViewProperty<Byte, AbstractArrowIdFlagsView> ID_FLAGS = ViewProperty.builder(AbstractArrowIdFlagsView::new)
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code IN_GROUND}
     *
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final SimpleProperty<Boolean> IN_GROUND = SimpleProperty.<Boolean>builder()
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
     * Property representing the metadata field {@code OWNERUUID}
     *
     * <p>Supported Versions: {@code 1.15-}</p>
     */
    public static final SimpleProperty<Optional<UUID>> OWNERUUID = SimpleProperty.<Optional<UUID>>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.OPTIONAL_UUID)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.OPTIONAL_UUID)
    .build();

    /**
     * Property representing the metadata field {@code PIERCE_LEVEL}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Byte> PIERCE_LEVEL = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.BYTE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = ProjectileMetaProperties.SCHEMA.extend(EntityTypes.ABSTRACT_ARROW)
        .add(AbstractArrowMetaProperties.ID_FLAGS)
        .add(AbstractArrowMetaProperties.IN_GROUND)
        .add(AbstractArrowMetaProperties.OWNERUUID)
        .add(AbstractArrowMetaProperties.PIERCE_LEVEL)
        .build();

}
