// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.component.builtin.item.ItemProfile;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.Optional;
import net.kyori.adventure.text.Component;

/**
 * Metadata properties for the {@code Mannequin} meta
 * <p>Supported Versions: {@code 1.21.9+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Mannequin">Mannequin on the minecraft.wiki</a></p>
 */
public class MannequinMetaProperties extends AvatarMetaProperties {

    /**
     * Property representing the metadata field {@code DESCRIPTION}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<Optional<Component>> DESCRIPTION = SimpleProperty.<Optional<Component>>builder()
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.OPTIONAL_ADV_COMPONENT)
    .build();

    /**
     * Property representing the metadata field {@code IMMOVABLE}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<Boolean> IMMOVABLE = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code PROFILE}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<ItemProfile> PROFILE = SimpleProperty.<ItemProfile>builder()
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.RESOLVABLE_PROFILE)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.RESOLVABLE_PROFILE)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.RESOLVABLE_PROFILE)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.RESOLVABLE_PROFILE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AvatarMetaProperties.SCHEMA.extend(EntityTypes.MANNEQUIN)
        .add(MannequinMetaProperties.DESCRIPTION)
        .add(MannequinMetaProperties.IMMOVABLE)
        .add(MannequinMetaProperties.PROFILE)
        .build();

}
