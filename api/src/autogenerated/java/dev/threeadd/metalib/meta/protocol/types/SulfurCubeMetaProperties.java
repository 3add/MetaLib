// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Sulfur Cube} meta
 * <p>Supported Versions: {@code 26.2+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Sulfur_Cube">Sulfur Cube on the minecraft.wiki</a></p>
 */
public class SulfurCubeMetaProperties extends AbstractCubeMobMetaProperties {

    /**
     * Property representing the metadata field {@code FROM_BUCKET}
     *
     * <p>Supported Versions: {@code 26.2+}</p>
     */
    public static final SimpleProperty<Boolean> FROM_BUCKET = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code MAX_FUSE}
     *
     * <p>Supported Versions: {@code 26.2+}</p>
     */
    public static final SimpleProperty<Integer> MAX_FUSE = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractCubeMobMetaProperties.SCHEMA.extend(EntityTypes.SULFUR_CUBE)
        .add(SulfurCubeMetaProperties.FROM_BUCKET)
        .add(SulfurCubeMetaProperties.MAX_FUSE)
        .build();

}
