// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.chicken.ChickenSoundVariant;
import com.github.retrooper.packetevents.protocol.entity.chicken.ChickenVariant;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Chicken} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Chicken">Chicken on the minecraft.wiki</a></p>
 */
public class ChickenMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code SOUND_VARIANT}
     *
     * <p>Supported Versions: {@code 26.1+}</p>
     */
    public static final SimpleProperty<ChickenSoundVariant> SOUND_VARIANT = SimpleProperty.<ChickenSoundVariant>builder()
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.CHICKEN_SOUND_VARIANT)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.CHICKEN_SOUND_VARIANT)
    .build();

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static final SimpleProperty<ChickenVariant> VARIANT = SimpleProperty.<ChickenVariant>builder()
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.CHICKEN_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.CHICKEN_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.CHICKEN_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.CHICKEN_VARIANT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.CHICKEN_VARIANT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.CHICKEN_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.CHICKEN)
        .add(ChickenMetaProperties.SOUND_VARIANT)
        .add(ChickenMetaProperties.VARIANT)
        .build();

}
