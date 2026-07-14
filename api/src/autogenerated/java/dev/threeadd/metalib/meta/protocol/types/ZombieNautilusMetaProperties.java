// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.nautilus.ZombieNautilusVariant;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Zombie Nautilus} meta
 * <p>Supported Versions: {@code 1.21.11+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Zombie_Nautilus">Zombie Nautilus on the minecraft.wiki</a></p>
 */
public class ZombieNautilusMetaProperties extends AbstractNautilusMetaProperties {

    /**
     * Property representing the metadata field {@code VARIANT}
     *
     * <p>Supported Versions: {@code 1.21.11+}</p>
     */
    public static final SimpleProperty<ZombieNautilusVariant> VARIANT = SimpleProperty.<ZombieNautilusVariant>builder()
        .addVersion(ClientVersion.V_1_21_11, 20, EntityDataTypes.ZOMBIE_NAUTILUS_VARIANT)
        .addVersion(ClientVersion.V_26_1, 21, EntityDataTypes.ZOMBIE_NAUTILUS_VARIANT)
        .addVersion(ClientVersion.V_26_2, 21, EntityDataTypes.ZOMBIE_NAUTILUS_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractNautilusMetaProperties.SCHEMA.extend(EntityTypes.ZOMBIE_NAUTILUS)
        .add(ZombieNautilusMetaProperties.VARIANT)
        .build();

}
