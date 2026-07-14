// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Agable Mob} meta
 * <p>Supported Versions: {@code 1.16.2-}</p>
 */
public class AgableMobMetaProperties extends PathfinderMobMetaProperties {

    /**
     * Property representing the metadata field {@code BABY}
     *
     * <p>Supported Versions: {@code 1.16.2-}</p>
     */
    public static final SimpleProperty<Boolean> BABY = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 14, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 15, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 15, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 15, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = PathfinderMobMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(AgableMobMetaProperties.BABY)
        .build();

}
