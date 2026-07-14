// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Abstract Cube Mob} meta
 * <p>Supported Versions: {@code 26.2+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Abstract_Cube_Mob">Abstract Cube Mob on the minecraft.wiki</a></p>
 */
public class AbstractCubeMobMetaProperties extends AgeableMobMetaProperties {

    /**
     * Property representing the metadata field {@code ID_SIZE}
     *
     * <p>Supported Versions: {@code 26.2+}</p>
     */
    public static final SimpleProperty<Integer> ID_SIZE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AgeableMobMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(AbstractCubeMobMetaProperties.ID_SIZE)
        .build();

}
