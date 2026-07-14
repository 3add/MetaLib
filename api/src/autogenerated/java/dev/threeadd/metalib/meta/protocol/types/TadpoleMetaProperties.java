// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Tadpole} meta
 * <p>Supported Versions: {@code 1.19+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Tadpole">Tadpole on the minecraft.wiki</a></p>
 */
public class TadpoleMetaProperties extends AbstractFishMetaProperties {

    /**
     * Property representing the metadata field {@code AGE_LOCKED}
     *
     * <p>Supported Versions: {@code 26.1+}</p>
     */
    public static final SimpleProperty<Boolean> AGE_LOCKED = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractFishMetaProperties.SCHEMA.extend(EntityTypes.TADPOLE)
        .add(TadpoleMetaProperties.AGE_LOCKED)
        .build();

}
