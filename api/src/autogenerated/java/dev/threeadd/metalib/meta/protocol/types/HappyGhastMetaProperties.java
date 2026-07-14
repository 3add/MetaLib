// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Happy Ghast} meta
 * <p>Supported Versions: {@code 1.21.6+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Happy_Ghast">Happy Ghast on the minecraft.wiki</a></p>
 */
public class HappyGhastMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code IS_LEASH_HOLDER}
     *
     * <p>Supported Versions: {@code 1.21.6+}</p>
     */
    public static final SimpleProperty<Boolean> IS_LEASH_HOLDER = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code STAYS_STILL}
     *
     * <p>Supported Versions: {@code 1.21.6+}</p>
     */
    public static final SimpleProperty<Boolean> STAYS_STILL = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.HAPPY_GHAST)
        .add(HappyGhastMetaProperties.IS_LEASH_HOLDER)
        .add(HappyGhastMetaProperties.STAYS_STILL)
        .build();

}
