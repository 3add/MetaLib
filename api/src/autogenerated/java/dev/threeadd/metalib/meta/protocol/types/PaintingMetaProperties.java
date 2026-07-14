// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import com.github.retrooper.packetevents.protocol.world.painting.PaintingVariant;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Painting} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Painting">Painting on the minecraft.wiki</a></p>
 */
public class PaintingMetaProperties extends HangingEntityMetaProperties {

    /**
     * Property representing the metadata field {@code PAINTING_VARIANT}
     *
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static final SimpleProperty<PaintingVariant> PAINTING_VARIANT = SimpleProperty.<PaintingVariant>builder()
        .addVersion(ClientVersion.V_1_19, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_19_1, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_19_3, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_19_4, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_20_2, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_20_3, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_20_5, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21_2, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21_4, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21_5, 8, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21_6, 9, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21_9, 9, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_1_21_11, 9, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_26_1, 9, EntityDataTypes.PAINTING_VARIANT)
        .addVersion(ClientVersion.V_26_2, 9, EntityDataTypes.PAINTING_VARIANT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = HangingEntityMetaProperties.SCHEMA.extend(EntityTypes.PAINTING)
        .add(PaintingMetaProperties.PAINTING_VARIANT)
        .build();

}
