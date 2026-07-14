// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.particle.Particle;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.util.Vector3i;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;
import java.util.List;
import java.util.Optional;

/**
 * Metadata properties for the {@code Living Entity} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Living_Entity">Living Entity on the minecraft.wiki</a></p>
 */
public class LivingEntityMetaProperties extends EntityMetaProperties {

    /**
     * Property representing the metadata field {@code ARROW_COUNT}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Integer> ARROW_COUNT = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 11, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 12, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code EFFECT_AMBIENCE}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Boolean> EFFECT_AMBIENCE = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_14_4, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_15, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_16_2, 10, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_17, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 11, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 11, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code EFFECT_COLOR}
     *
     * <p>Supported Versions: {@code 1.20.3-}</p>
     */
    public static final SimpleProperty<Integer> EFFECT_COLOR = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_14_4, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_15, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 9, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 10, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 10, EntityDataTypes.INT)
    .build();

    /**
     * Property representing the metadata field {@code EFFECT_PARTICLES}
     *
     * <p>Supported Versions: {@code 1.20.5+}</p>
     */
    public static final SimpleProperty<List<Particle<?>>> EFFECT_PARTICLES = SimpleProperty.<List<Particle<?>>>builder()
        .addVersion(ClientVersion.V_1_20_5, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21_2, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21_4, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21_5, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21_6, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21_9, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_1_21_11, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_26_1, 10, EntityDataTypes.PARTICLES)
        .addVersion(ClientVersion.V_26_2, 10, EntityDataTypes.PARTICLES)
    .build();

    /**
     * Property representing the metadata field {@code HEALTH}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Float> HEALTH = SimpleProperty.<Float>builder()
        .addVersion(ClientVersion.V_1_14_4, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_15, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_16_2, 8, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_17, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_1, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_3, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_19_4, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_2, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_3, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_20_5, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_2, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_4, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_5, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.FLOAT)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.FLOAT)
    .build();

    /**
     * Property representing the metadata field {@code LIVING_ENTITY_FLAGS}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Byte> LIVING_ENTITY_FLAGS = SimpleProperty.<Byte>builder()
        .addVersion(ClientVersion.V_1_14_4, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_15, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_16_2, 7, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_17, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_6, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_9, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_1_21_11, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_1, 8, EntityDataTypes.BYTE)
        .addVersion(ClientVersion.V_26_2, 8, EntityDataTypes.BYTE)
    .build();

    /**
     * Property representing the metadata field {@code SLEEPING_POS}
     *
     * <p>Supported Versions: {@code All Supported Versions}</p>
     */
    public static final SimpleProperty<Optional<Vector3i>> SLEEPING_POS = SimpleProperty.<Optional<Vector3i>>builder()
        .addVersion(ClientVersion.V_1_14_4, 12, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_15, 13, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16, 13, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_16_2, 13, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_17, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_1, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_3, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_19_4, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_2, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_3, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_20_5, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_2, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_4, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_5, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_6, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_9, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_1_21_11, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_1, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
        .addVersion(ClientVersion.V_26_2, 14, EntityDataTypes.OPTIONAL_BLOCK_POSITION)
    .build();

    /**
     * Property representing the metadata field {@code STINGER_COUNT}
     *
     * <p>Supported Versions: {@code 1.15+}</p>
     */
    public static final SimpleProperty<Integer> STINGER_COUNT = SimpleProperty.<Integer>builder()
        .addVersion(ClientVersion.V_1_15, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_16_2, 12, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_17, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_1, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_3, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_19_4, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_2, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_3, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_20_5, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_2, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_4, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 13, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 13, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = EntityMetaProperties.SCHEMA.extend(null) // TODO Entity Type need mappings
        .add(LivingEntityMetaProperties.ARROW_COUNT)
        .add(LivingEntityMetaProperties.EFFECT_AMBIENCE)
        .add(LivingEntityMetaProperties.EFFECT_COLOR)
        .add(LivingEntityMetaProperties.EFFECT_PARTICLES)
        .add(LivingEntityMetaProperties.HEALTH)
        .add(LivingEntityMetaProperties.LIVING_ENTITY_FLAGS)
        .add(LivingEntityMetaProperties.SLEEPING_POS)
        .add(LivingEntityMetaProperties.STINGER_COUNT)
        .build();

}
