package dev.threeadd.packetentities.codegen.data.fetch;

import dev.threeadd.packetentities.codegen.data.MetadataNode;
import org.jetbrains.annotations.Nullable;
import java.util.Map;

/**
 * Unparsed metadata for a specific single version, view {@link MetadataNode}
 * for a more parsed version
 */
public record MetaData(@Nullable String rawSuperClassName, Map<String, FieldData> fields) {

    public MetaData {
        fields = Map.copyOf(fields);
    }

}
