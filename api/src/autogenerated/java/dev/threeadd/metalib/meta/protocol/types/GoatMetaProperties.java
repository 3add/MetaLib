// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Goat} meta
 * <p>Supported Versions: {@code 1.17+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Goat">Goat on the minecraft.wiki</a></p>
 */
public class GoatMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code HAS_LEFT_HORN}
     *
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static final SimpleProperty<Boolean> HAS_LEFT_HORN = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_19, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 19, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code HAS_RIGHT_HORN}
     *
     * <p>Supported Versions: {@code 1.19+}</p>
     */
    public static final SimpleProperty<Boolean> HAS_RIGHT_HORN = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_19, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 19, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 20, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 20, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * Property representing the metadata field {@code IS_SCREAMING_GOAT}
     *
     * <p>Supported Versions: {@code 1.17+}</p>
     */
    public static final SimpleProperty<Boolean> IS_SCREAMING_GOAT = SimpleProperty.<Boolean>builder()
        .addVersion(ClientVersion.V_1_17, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_1, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_3, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_19_4, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_2, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_3, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.BOOLEAN)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.BOOLEAN)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.GOAT)
        .add(GoatMetaProperties.HAS_LEFT_HORN)
        .add(GoatMetaProperties.HAS_RIGHT_HORN)
        .add(GoatMetaProperties.IS_SCREAMING_GOAT)
        .build();

}
