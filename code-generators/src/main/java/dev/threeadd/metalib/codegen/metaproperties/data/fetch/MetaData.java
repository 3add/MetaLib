package dev.threeadd.metalib.codegen.metaproperties.data.fetch;

import org.jetbrains.annotations.Nullable;
import java.util.Map;

/**
 * Unparsed metadata for a specific single version, view {@link dev.threeadd.metalib.codegen.metaproperties.data.MetadataNode}
 * for a more parsed version
 */
public record MetaData(@Nullable String rawSuperClassName, Map<String, FieldData> fields) {

    public MetaData {
        fields = Map.copyOf(fields);
    }

}
