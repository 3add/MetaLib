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
 * Metadata properties for the {@code Item Frame} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Item_Frame">Item Frame on the minecraft.wiki</a></p>
 */
public class ItemFrameMetaProperties extends HangingEntityMetaProperties {

    /**
     * Property representing the metadata field {@code ITEM}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<ItemStack> ITEM = SimpleProperty.<ItemStack>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.ITEMSTACK)
    .build();

    /**
     * Property representing the metadata field {@code ROTATION}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> ROTATION = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 10, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = HangingEntityMetaProperties.SCHEMA.extend(EntityTypes.ITEM_FRAME)
        .add(ItemFrameMetaProperties.ITEM)
        .add(ItemFrameMetaProperties.ROTATION)
        .build();

}
