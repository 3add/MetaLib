package dev.threeadd.metalib.codegen.metaproperties.data.mapping;

import com.palantir.javapoet.ClassName;
import java.util.HashMap;
import java.util.Map;

/**
 * Used in {@link DataTypeMapper} to identify specific fields in specific entity metadata types,
 * then to apply a custom view
 */
public record FieldTarget(String owningMetaClass, String property) {

    public static FieldTarget of(String owningMetaClass, String property) {
        return new FieldTarget(owningMetaClass, property);
    }

    public static RegistryBuilder registry() {
        return new RegistryBuilder();
    }

    public static class RegistryBuilder {
        private final Map<FieldTarget, ClassName> registryMap = new HashMap<>();
        private String activePackage = "";

        public RegistryBuilder inPackage(String packageName) {
            this.activePackage = packageName;
            return this;
        }

        public RegistryBuilder add(String metaClass, String property, String viewSimpleName) {
            if (this.activePackage == null || this.activePackage.isBlank()) {
                throw new IllegalStateException("No active package context set. Call .inPackage() first or use the explicit package add() method.");
            }
            return add(metaClass, property, this.activePackage, viewSimpleName);
        }

        public RegistryBuilder add(String metaClass, String property, String packageName, String viewSimpleName) {
            FieldTarget target = new FieldTarget(metaClass, property);
            ClassName viewClass = ClassName.get(packageName, viewSimpleName);
            this.registryMap.put(target, viewClass);
            return this;
        }

        public Map<FieldTarget, ClassName> build() {
            return Map.copyOf(this.registryMap);
        }
    }

}
