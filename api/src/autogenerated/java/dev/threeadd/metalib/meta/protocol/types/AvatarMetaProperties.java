// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.protocol.player.HumanoidArm;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.bitmask.view.AvatarPlayerModeCustomizationFlagsView;

/**
 * Metadata properties for the {@code Avatar} meta
 * <p>Supported Versions: {@code 1.21.9+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Avatar">Avatar on the minecraft.wiki</a></p>
 */
public class AvatarMetaProperties extends LivingEntityMetaProperties {

    /**
     * Property representing the metadata field {@code PLAYER_MAIN_HAND}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<HumanoidArm> PLAYER_MAIN_HAND = SimpleProperty.<HumanoidArm>builder()
        // TODO type changed from 'Byte' to 'HumanoidArm', converter required
        .addVersion(ClientVersion.V_1_21_11, 15, EntityDataTypes.HUMANOID_ARM)
        .addVersion(ClientVersion.V_26_1, 15, EntityDataTypes.HUMANOID_ARM)
        .addVersion(ClientVersion.V_26_2, 15, EntityDataTypes.HUMANOID_ARM)
    .build();

    /**
     * Property representing the metadata field {@code PLAYER_MODE_CUSTOMISATION}
     *
     * <p>Wrapped by view: {@link AvatarPlayerModeCustomizationFlagsView}</p>
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final ViewProperty<Byte, AvatarPlayerModeCustomizationFlagsView> PLAYER_MODE_CUSTOMISATION = ViewProperty.builder(AvatarPlayerModeCustomizationFlagsView::new)
        .addVersion(ClientVersion.V_1_21_9, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 16, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 16, EntityDataTypes.BYTE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = LivingEntityMetaProperties.SCHEMA.extend(EntityTypes.PLAYER)
        .add(AvatarMetaProperties.PLAYER_MAIN_HAND)
        .add(AvatarMetaProperties.PLAYER_MODE_CUSTOMISATION)
        .build();

}
