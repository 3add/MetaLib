package dev.threeadd.packetentities.codegen.data.fetch;

import dev.threeadd.packetentities.codegen.data.PropertyNode;

/**
 * Unparsed field data, view {@link PropertyNode} for a more parsed instance
 */
public record FieldData(int index, String rawDataType) {
}
