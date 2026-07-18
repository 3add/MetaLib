package dev.threeadd.packetentities.codegen.data;

import dev.threeadd.packetentities.codegen.MetaPropertiesCodeGen;
import dev.threeadd.packetentities.codegen.data.fetch.FieldData;
import dev.threeadd.packetentities.codegen.data.mapping.DataTypeMapping;

import java.util.Map;
import java.util.TreeMap;

/**
 * Represents a metadata property after parsing from {@link MetaPropertiesCodeGen#DATA_URL_FORMAT}
 */
public class PropertyNode {

    private final String fieldName;
    private final Map<String, FieldData> versions = new TreeMap<>(MetaPropertiesCodeGen.VERSION_COMPARATOR);
    private DataTypeMapping dataTypeMapping;

    public PropertyNode(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public DataTypeMapping getTypeMapping() {
        return this.dataTypeMapping;
    }

    public void setTypeMapping(DataTypeMapping dataTypeMapping) {
        this.dataTypeMapping = dataTypeMapping;
    }

    public Map<String, FieldData> getVersions() {
        return this.versions;
    }

}
