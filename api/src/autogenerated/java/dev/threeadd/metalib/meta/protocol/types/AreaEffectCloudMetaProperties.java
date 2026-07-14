// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.particle.Particle;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Area Effect Cloud} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Area_Effect_Cloud">Area Effect Cloud on the minecraft.wiki</a></p>
 */
public class AreaEffectCloudMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code COLOR}
     *
     * <p>Supported Versions: {@code 1.20.3-}</p>
     */
    public static final SimpleProperty<Integer> COLOR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code PARTICLE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Particle<?>> PARTICLE = SimpleProperty.<Particle<?>>builder()
        .addVersion(ClientVersion.V_1_14_4, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_15, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_16, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_16_2, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_17, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_19, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_19_1, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_19_3, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_19_4, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_20_2, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_20_3, 11, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21_2, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21_4, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21_5, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21_6, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21_9, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_1_21_11, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_26_1, 10, EntityDataTypes.PARTICLE)
        .addVersion(ClientVersion.V_26_2, 10, EntityDataTypes.PARTICLE)
    .build();

    /**
     * Property representing the metadata field {@code RADIUS}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Float> RADIUS = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code WAITING}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> WAITING = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(EntityTypes.AREA_EFFECT_CLOUD)
        .add(AreaEffectCloudMetaProperties.COLOR)
        .add(AreaEffectCloudMetaProperties.PARTICLE)
        .add(AreaEffectCloudMetaProperties.RADIUS)
        .add(AreaEffectCloudMetaProperties.WAITING)
        .build();

}
