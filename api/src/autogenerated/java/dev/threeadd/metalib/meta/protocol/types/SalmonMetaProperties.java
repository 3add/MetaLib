// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.ViewProperty;
import dev.threeadd.metalib.meta.protocol.enums.view.SalmonTypeView;

/**
 * Metadata properties for the {@code Salmon} meta
 * <p>Supported Versions: {@code All Supported Versions}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Salmon">Salmon on the minecraft.wiki</a></p>
 */
public class SalmonMetaProperties extends AbstractSchoolingFishMetaProperties {

    /**
     * Property representing the metadata field {@code TYPE}
     *
     * <p>Wrapped by view: {@link SalmonTypeView}</p>
     * <p>Supported Versions: {@code 1.21.2+}</p>
     */
    public static final ViewProperty<Integer, SalmonTypeView> TYPE = ViewProperty.builder(SalmonTypeView::new)
        // TODO type changed from 'String' to 'Integer', converter required
        .addVersion(ClientVersion.V_1_21_4, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_5, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_6, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.INT)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.INT)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractSchoolingFishMetaProperties.SCHEMA.extend(EntityTypes.SALMON)
        .add(SalmonMetaProperties.TYPE)
        .build();

}
