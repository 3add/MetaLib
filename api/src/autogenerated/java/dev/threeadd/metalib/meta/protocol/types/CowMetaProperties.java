// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.cow.CowSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.cow.CowVariant;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Cow} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Cow">Cow on the minecraft.wiki</a></p>
 */
public class CowMetaProperties extends AbstractCowMetaProperties {

    /**
     * Property representing the metadata field {@code SOUND_VARIANT}
     *
     * <p>Supported Versions: {@code 26.1+}</p>
     */
    public static final SimpleProperty<CowSoundVariant> SOUND_VARIANT = SimpleProperty.<CowSoundVariant>builder()
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.COW_SOUND_VARIANT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.COW_SOUND_VARIANT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static final SimpleProperty<CowVariant> VARIANT = SimpleProperty.<CowVariant>builder()
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.COW_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.COW_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.COW_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.COW_VARIANT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.COW_VARIANT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.COW_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractCowMetaProperties.SCHEMA.extend(EntityTypes.COW)
        .add(CowMetaProperties.SOUND_VARIANT)
        .add(CowMetaProperties.VARIANT)
        .build();

}
