// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.Optional;

/**
 * Metadata properties for the {@code Firework Rocket Entity} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class FireworkRocketEntityMetaProperties extends ProjectileMetaProperties {

    /**
     * Property representing the metadata field {@code ATTACHED_TO_TARGET}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Optional<Integer>> ATTACHED_TO_TARGET = SimpleProperty.<Optional<Integer>>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.OPTIONAL_INT)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.OPTIONAL_INT)
    .build();

    /**
     * Property representing the metadata field {@code FIREWORKS_ITEM}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<ItemStack> FIREWORKS_ITEM = SimpleProperty.<ItemStack>builder()
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
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.ITEMSTACK)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.ITEMSTACK)
    .build();

    /**
     * Property representing the metadata field {@code SHOT_AT_ANGLE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> SHOT_AT_ANGLE = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.BOOLEAN)
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
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = ProjectileMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(FireworkRocketEntityMetaProperties.ATTACHED_TO_TARGET)
        .add(FireworkRocketEntityMetaProperties.FIREWORKS_ITEM)
        .add(FireworkRocketEntityMetaProperties.SHOT_AT_ANGLE)
        .build();

}
