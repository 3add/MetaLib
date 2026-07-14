// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import net.kyori.adventure.text.Component;

/**
 * Metadata properties for the {@code Text Display} meta
 * <p>Supported Versions: {@code 1.19.4+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Text_Display">Text Display on the minecraft.wiki</a></p>
 */
public class TextDisplayMetaProperties extends DisplayMetaProperties {

    /**
     * Property representing the metadata field {@code BACKGROUND_COLOR}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Integer> BACKGROUND_COLOR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 25, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 25, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code LINE_WIDTH}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Integer> LINE_WIDTH = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_19_4, 23, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 24, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 24, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code STYLE_FLAGS}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Byte> STYLE_FLAGS = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_19_4, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 27, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 27, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code TEXT}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Component> TEXT = SimpleProperty.<Component>builder()
        .addVersion(ClientVersion.V_1_19_4, 22, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_2, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_3, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_20_5, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_2, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_4, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_5, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_6, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_9, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_11, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_1, 23, EntityDataTypes.ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_2, 23, EntityDataTypes.ADV_COMPONENT)
    .build();

    /**
     * Property representing the metadata field {@code TEXT_OPACITY}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Byte> TEXT_OPACITY = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_19_4, 25, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 26, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 26, EntityDataTypes.BYTE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = DisplayMetaProperties.SCHEMA.extend(EntityTypes.TEXT_DISPLAY)
        .add(TextDisplayMetaProperties.BACKGROUND_COLOR)
        .add(TextDisplayMetaProperties.LINE_WIDTH)
        .add(TextDisplayMetaProperties.STYLE_FLAGS)
        .add(TextDisplayMetaProperties.TEXT)
        .add(TextDisplayMetaProperties.TEXT_OPACITY)
        .build();

}
