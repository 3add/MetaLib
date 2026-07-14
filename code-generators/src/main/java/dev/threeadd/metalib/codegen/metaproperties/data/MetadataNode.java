package dev.threeadd.metalib.codegen.metaproperties.data;

import dev.threeadd.metalib.codegen.metaproperties.MetaPropertiesCodeGen;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Represents a Metadata information node parsed from {@link MetaPropertiesCodeGen#DATA_URL_FORMAT}
 */
public class MetadataNode {

    private final String className;
    private String superClassName;
    private final Map<String, PropertyNode> properties = new TreeMap<>();
    private final Set<String> supportedVersions = new TreeSet<>(MetaPropertiesCodeGen.VERSION_COMPARATOR);

    public MetadataNode(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public String getSuperClassName() {
        return this.superClassName;
    }

    public void setSuperClassName(String superClassName) {
        this.superClassName = superClassName;
    }

    public Map<String, PropertyNode> getProperties() {
        return this.properties;
    }

    public Set<String> getSupportedVersions() {
        return this.supportedVersions;
    }

}
