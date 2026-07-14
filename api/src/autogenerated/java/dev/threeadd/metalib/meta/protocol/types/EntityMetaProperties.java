// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.pose.EntityPose;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.IMetadataPropertyHolder;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.bitmask.view.EntitySharedFlagsView;
import java.util.Optional;
import net.kyori.adventure.text.Component;

/**
 * Metadata properties for the {@code Entity} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Entity">Entity on the minecraft.wiki</a></p>
 */
public class EntityMetaProperties implements IMetadataPropertyHolder {

    /**
     * Property representing the metadata field {@code AIR_SUPPLY}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> AIR_SUPPLY = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 1, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 1, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code CUSTOM_NAME}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Optional<Component>> CUSTOM_NAME = SimpleProperty.<Optional<Component>>builder()
        .addVersion(ClientVersion.V_1_14_4, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_15, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_16, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_16_2, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_17, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19_1, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19_3, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_19_4, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_2, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_3, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_5, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_2, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_4, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_5, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_6, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_9, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_11, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_1, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_2, 2, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
    .build();

    /**
     * Property representing the metadata field {@code CUSTOM_NAME_VISIBLE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> CUSTOM_NAME_VISIBLE = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 3, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 3, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code NO_GRAVITY}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> NO_GRAVITY = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 5, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 5, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code POSE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<EntityPose> POSE = SimpleProperty.<EntityPose>builder()
        .addVersion(ClientVersion.V_1_14_4, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_15, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_16, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_16_2, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_17, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_19, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_19_1, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_19_3, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_19_4, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_20_2, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_20_3, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_20_5, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21_2, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21_4, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21_5, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21_6, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21_9, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_1_21_11, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_26_1, 6, EntityDataTypes.ENTITY_POSE)
        .addVersion(ClientVersion.V_26_2, 6, EntityDataTypes.ENTITY_POSE)
    .build();

    /**
     * Property representing the metadata field {@code SHARED_FLAGS}
     *
     * <p>Wrapped by view: {@link EntitySharedFlagsView}</p>
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final ViewProperty<Byte, EntitySharedFlagsView> SHARED_FLAGS = ViewProperty.builder(EntitySharedFlagsView::new)
        .addVersion(ClientVersion.V_1_14_4, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 0, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 0, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code SILENT}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> SILENT = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 4, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 4, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code TICKS_FROZEN}
     *
     * <p>Supported Versions: {@code 1.17+}</p>
     */
    public static final SimpleProperty<Integer> TICKS_FROZEN = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_17, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 7, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 7, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = MetadataSchema.builder(EntityTypes.ENTITY)
        .add(EntityMetaProperties.AIR_SUPPLY)
        .add(EntityMetaProperties.CUSTOM_NAME)
        .add(EntityMetaProperties.CUSTOM_NAME_VISIBLE)
        .add(EntityMetaProperties.NO_GRAVITY)
        .add(EntityMetaProperties.POSE)
        .add(EntityMetaProperties.SHARED_FLAGS)
        .add(EntityMetaProperties.SILENT)
        .add(EntityMetaProperties.TICKS_FROZEN)
        .build();

}
