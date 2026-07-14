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
 * Metadata properties for the {@code Ominous Item Spawner} meta
 * <p>Supported Versions: {@code 1.20.5+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Ominous_Item_Spawner">Ominous Item Spawner on the minecraft.wiki</a></p>
 */
public class OminousItemSpawnerMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code ITEM}
     *
     * <p>Supported Versions: {@code 1.20.5+}</p>
     */
    public static final SimpleProperty<ItemStack> ITEM = SimpleProperty.<ItemStack>builder()
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.OMINOUS_ITEM_SPAWNER)
        .add(OminousItemSpawnerMetaProperties.ITEM)
        .build();

}
