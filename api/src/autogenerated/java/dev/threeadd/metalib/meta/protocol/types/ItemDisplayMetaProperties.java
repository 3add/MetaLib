// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Item Display} meta
 * <p>Supported Versions: {@code 1.19.4+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Item_Display">Item Display on the minecraft.wiki</a></p>
 */
public class ItemDisplayMetaProperties extends DisplayMetaProperties {

    /**
     * Property representing the metadata field {@code ITEM_DISPLAY}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<Byte> ITEM_DISPLAY = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_19_4, 23, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 24, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 24, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code ITEM_STACK}
     *
     * <p>Supported Versions: {@code 1.19.4+}</p>
     */
    public static final SimpleProperty<ItemStack> ITEM_STACK = SimpleProperty.<ItemStack>builder()
        .addVersion(ClientVersion.V_1_19_4, 22, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_20_2, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_20_3, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_20_5, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_2, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_4, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_5, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_6, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_9, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_11, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_1, 23, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_2, 23, EntityDataTypes.ITEMSTACK)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = DisplayMetaProperties.SCHEMA.extend(EntityTypes.ITEM_DISPLAY)
        .add(ItemDisplayMetaProperties.ITEM_DISPLAY)
        .add(ItemDisplayMetaProperties.ITEM_STACK)
        .build();

}
