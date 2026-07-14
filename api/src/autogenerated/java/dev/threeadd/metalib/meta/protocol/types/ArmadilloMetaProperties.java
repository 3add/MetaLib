// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.armadillo.ArmadilloState;
import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Armadillo} meta
 * <p>Supported Versions: {@code 1.20.5+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Armadillo">Armadillo on the minecraft.wiki</a></p>
 */
public class ArmadilloMetaProperties extends AnimalMetaProperties {

    /**
     * Property representing the metadata field {@code ARMADILLO_STATE}
     *
     * <p>Supported Versions: {@code 1.20.5+}</p>
     */
    public static final SimpleProperty<ArmadilloState> ARMADILLO_STATE = SimpleProperty.<ArmadilloState>builder()
        .addVersion(ClientVersion.V_1_20_5, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21_2, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_26_1, 18, EntityDataTypes.ARMADILLO_STATE)
        .addVersion(ClientVersion.V_26_2, 18, EntityDataTypes.ARMADILLO_STATE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AnimalMetaProperties.SCHEMA.extend(EntityTypes.ARMADILLO)
        .add(ArmadilloMetaProperties.ARMADILLO_STATE)
        .build();

}
