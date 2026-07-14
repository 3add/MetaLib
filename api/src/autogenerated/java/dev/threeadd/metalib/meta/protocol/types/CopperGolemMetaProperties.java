// Auto-generated file. Do not edit manually.
//
package dev.threeadd.metalib.meta.protocol.types;

import com.github.retrooper.packetevents.protocol.entity.data.EntityDataTypes;
import com.github.retrooper.packetevents.protocol.entity.data.struct.CopperGolemState;
import com.github.retrooper.packetevents.protocol.entity.data.struct.WeatheringCopperState;
import com.github.retrooper.packetevents.protocol.entity.type.EntityTypes;
import com.github.retrooper.packetevents.protocol.player.ClientVersion;
import dev.threeadd.metalib.meta.MetadataSchema;
import dev.threeadd.metalib.meta.property.SimpleProperty;

/**
 * Metadata properties for the {@code Copper Golem} meta
 * <p>Supported Versions: {@code 1.21.9+}</p>
 * <p><a href="https://minecraft.wiki/w/Java_Edition_protocol/Entity_metadata#Copper_Golem">Copper Golem on the minecraft.wiki</a></p>
 */
public class CopperGolemMetaProperties extends AbstractGolemMetaProperties {

    /**
     * Property representing the metadata field {@code COPPER_GOLEM_STATE}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<CopperGolemState> COPPER_GOLEM_STATE = SimpleProperty.<CopperGolemState>builder()
        .addVersion(ClientVersion.V_1_21_9, 17, EntityDataTypes.COPPER_GOLEM_STATE)
        .addVersion(ClientVersion.V_1_21_11, 17, EntityDataTypes.COPPER_GOLEM_STATE)
        .addVersion(ClientVersion.V_26_1, 17, EntityDataTypes.COPPER_GOLEM_STATE)
        .addVersion(ClientVersion.V_26_2, 17, EntityDataTypes.COPPER_GOLEM_STATE)
    .build();

    /**
     * Property representing the metadata field {@code WEATHER_STATE}
     *
     * <p>Supported Versions: {@code 1.21.9+}</p>
     */
    public static final SimpleProperty<WeatheringCopperState> WEATHER_STATE = SimpleProperty.<WeatheringCopperState>builder()
        .addVersion(ClientVersion.V_1_21_9, 16, EntityDataTypes.WEATHERING_COPPER_STATE)
        .addVersion(ClientVersion.V_1_21_11, 16, EntityDataTypes.WEATHERING_COPPER_STATE)
        .addVersion(ClientVersion.V_26_1, 16, EntityDataTypes.WEATHERING_COPPER_STATE)
        .addVersion(ClientVersion.V_26_2, 16, EntityDataTypes.WEATHERING_COPPER_STATE)
    .build();

    /**
     * The {@link MetadataSchema} containing this meta's properties, combined with all
     * properties declared by its super classes.
     */
    public static final MetadataSchema SCHEMA = AbstractGolemMetaProperties.SCHEMA.extend(EntityTypes.COPPER_GOLEM)
        .add(CopperGolemMetaProperties.COPPER_GOLEM_STATE)
        .add(CopperGolemMetaProperties.WEATHER_STATE)
        .build();

}
