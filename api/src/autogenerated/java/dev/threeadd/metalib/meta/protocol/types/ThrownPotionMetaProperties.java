// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Thrown Potion} meta
 * <p>Supported Versions: {@code 1.21.4-}</p>
 */
public class ThrownPotionMetaProperties extends ThrowableItemProjectileMetaProperties {

    /**
     * Property representing the metadata field {@code ITEM_STACK}
     *
     * <p>Supported Versions: {@code 1.15-}</p>
     */
    public static final SimpleProperty<ItemStack> ITEM_STACK = SimpleProperty.<ItemStack>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.ITEMSTACK)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = ThrowableItemProjectileMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(ThrownPotionMetaProperties.ITEM_STACK)
        .build();

}
