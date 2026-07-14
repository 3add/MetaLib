// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.util.Quaternion4f;
import com.github.retrooper.packetevents.util.Vector3f;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.enums.view.DisplayBillboardView;

/**
 * Metadata properties for the {@code Display} meta
 * <p>Supported Versions: {@code 1.19.4+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Display">Display on the minecraft.wiki</a></p>
 */
public class DisplayMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code BILLBOARD_RENDER_CONSTRAINTS}
     *
     * <p>Wrapped by view: {@link DisplayBillboardView}</p>
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final ViewProperty<Byte, DisplayBillboardView> BILLBOARD_RENDER_CONSTRAINTS = ViewProperty.builder(DisplayBillboardView::new)
        .addVersion(ClientVersion.V_1_19_4, 14, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 15, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 15, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code BRIGHTNESS_OVERRIDE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Integer> BRIGHTNESS_OVERRIDE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 15, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 16, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 16, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code GLOW_COLOR_OVERRIDE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Integer> GLOW_COLOR_OVERRIDE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 21, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 22, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 22, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code HEIGHT}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> HEIGHT = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 21, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 21, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code INTERPOLATION_DURATION}
     *
     * <p>Supported Versions: {@code 1.19.4}</p>
     */
    public static final SimpleProperty<Integer> INTERPOLATION_DURATION = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code INTERPOLATION_START_DELTA_TICKS}
     *
     * <p>Supported Versions: {@code 1.19.4}</p>
     */
    public static final SimpleProperty<Integer> INTERPOLATION_START_DELTA_TICKS = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code LEFT_ROTATION}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Quaternion4f> LEFT_ROTATION = SimpleProperty.<Quaternion4f>builder()
        .addVersion(ClientVersion.V_1_19_4, 12, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_20_2, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_20_3, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_20_5, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_2, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_4, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_5, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_6, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_9, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_11, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_26_1, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_26_2, 13, EntityDataTypes.QUATERNION)
    .build();

    /**
     * Property representing the metadata field {@code POS_ROT_INTERPOLATION_DURATION}
     *
     * <p>Supported Versions: {@code 1.20.2+}</p>
     */
    public static final SimpleProperty<Integer> POS_ROT_INTERPOLATION_DURATION = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 10, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code RIGHT_ROTATION}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Quaternion4f> RIGHT_ROTATION = SimpleProperty.<Quaternion4f>builder()
        .addVersion(ClientVersion.V_1_19_4, 13, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_20_2, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_20_3, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_20_5, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_2, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_4, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_5, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_6, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_9, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_1_21_11, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_26_1, 14, EntityDataTypes.QUATERNION)
        .addVersion(ClientVersion.V_26_2, 14, EntityDataTypes.QUATERNION)
    .build();

    /**
     * Property representing the metadata field {@code SCALE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Vector3f> SCALE = SimpleProperty.<Vector3f>builder()
        .addVersion(ClientVersion.V_1_19_4, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_20_2, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_20_3, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_20_5, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_2, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_4, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_5, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_6, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_9, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_11, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_26_1, 12, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_26_2, 12, EntityDataTypes.VECTOR3F)
    .build();

    /**
     * Property representing the metadata field {@code SHADOW_RADIUS}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> SHADOW_RADIUS = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code SHADOW_STRENGTH}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> SHADOW_STRENGTH = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code TRANSFORMATION_INTERPOLATION_DURATION}
     *
     * <p>Supported Versions: {@code 1.20.2+}</p>
     */
    public static final SimpleProperty<Integer> TRANSFORMATION_INTERPOLATION_DURATION = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS}
     *
     * <p>Supported Versions: {@code 1.20.2+}</p>
     */
    public static final SimpleProperty<Integer> TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code TRANSLATION}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Vector3f> TRANSLATION = SimpleProperty.<Vector3f>builder()
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_20_2, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_20_3, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_20_5, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_2, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_4, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_5, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_6, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_9, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_1_21_11, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_26_1, 11, EntityDataTypes.VECTOR3F)
        .addVersion(ClientVersion.V_26_2, 11, EntityDataTypes.VECTOR3F)
    .build();

    /**
     * Property representing the metadata field {@code VIEW_RANGE}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> VIEW_RANGE = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 16, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code WIDTH}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Float> WIDTH = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.FLOAT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.DISPLAY)
        .add(DisplayMetaProperties.BILLBOARD_RENDER_CONSTRAINTS)
        .add(DisplayMetaProperties.BRIGHTNESS_OVERRIDE)
        .add(DisplayMetaProperties.GLOW_COLOR_OVERRIDE)
        .add(DisplayMetaProperties.HEIGHT)
        .add(DisplayMetaProperties.INTERPOLATION_DURATION)
        .add(DisplayMetaProperties.INTERPOLATION_START_DELTA_TICKS)
        .add(DisplayMetaProperties.LEFT_ROTATION)
        .add(DisplayMetaProperties.POS_ROT_INTERPOLATION_DURATION)
        .add(DisplayMetaProperties.RIGHT_ROTATION)
        .add(DisplayMetaProperties.SCALE)
        .add(DisplayMetaProperties.SHADOW_RADIUS)
        .add(DisplayMetaProperties.SHADOW_STRENGTH)
        .add(DisplayMetaProperties.TRANSFORMATION_INTERPOLATION_DURATION)
        .add(DisplayMetaProperties.TRANSFORMATION_INTERPOLATION_START_DELTA_TICKS)
        .add(DisplayMetaProperties.TRANSLATION)
        .add(DisplayMetaProperties.VIEW_RANGE)
        .add(DisplayMetaProperties.WIDTH)
        .build();

}
