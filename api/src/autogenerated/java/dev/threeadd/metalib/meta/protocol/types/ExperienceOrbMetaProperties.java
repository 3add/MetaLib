// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Experience Orb} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Experience_Orb">Experience Orb on the minecraft.wiki</a></p>
 */
public class ExperienceOrbMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code VALUE}
     *
     * <p>Supported Versions: {@code 1.21.5+}</p>
     */
    public static final SimpleProperty<Integer> VALUE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.EXPERIENCE_ORB)
        .add(ExperienceOrbMetaProperties.VALUE)
        .build();

}
