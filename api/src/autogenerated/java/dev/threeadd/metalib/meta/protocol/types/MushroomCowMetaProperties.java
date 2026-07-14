// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Mushroom Cow} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 */
public class MushroomCowMetaProperties extends AbstractCowMetaProperties {

    /**
     * Property representing the metadata field {@code TYPE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> TYPE = SimpleProperty.<Integer>builder()
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        // TODO type changed from 'String' to 'Integer', converter required
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractCowMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(MushroomCowMetaProperties.TYPE)
        .build();

}
