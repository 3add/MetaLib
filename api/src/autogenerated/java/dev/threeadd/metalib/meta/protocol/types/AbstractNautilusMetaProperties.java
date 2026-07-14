// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Abstract Nautilus} meta
 * <p>Supported Versions: {@code 1.21.11+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Nautilus">Abstract Nautilus on the minecraft.wiki</a></p>
 */
public class AbstractNautilusMetaProperties extends TamableAnimalMetaProperties {

    /**
     * Property representing the metadata field {@code DASH}
     *
     * <p>Supported Versions: {@code 1.21.11+}</p>
     */
    public static final SimpleProperty<Boolean> DASH = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = TamableAnimalMetaProperties.SCHEMA.extend(EntityTypes.ABSTRACT_NAUTILUS)
        .add(AbstractNautilusMetaProperties.DASH)
        .build();

}
