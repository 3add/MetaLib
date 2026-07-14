package dev.threeadd.metalib.codegen.metaproperties.generator;

import com.palantir.javapoet.*;
import dev.threeadd.metalib.codegen.metaproperties.data.PropertyNode;
import dev.threeadd.metalib.codegen.metaproperties.data.fetch.FieldData;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.DataTypeMapper;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.DataTypeMapping;

import javax.lang.model.element.Modifier;
import java.util.Map;
import java.util.Objects;

public class PropertyFieldGenerator {

    private static final ClassName SIMPLE_PROPERTY = ClassName.get("dev.threeadd.metalib.meta.property", "SimpleProperty");
    private static final ClassName VIEW_PROPERTY = ClassName.get("dev.threeadd.metalib.meta.property", "ViewProperty");
    private static final ClassName CLIENT_VERSION = ClassName.get("com.github.retrooper.packetevents.protocol.player", "ClientVersion");
    private static final ClassName ENTITY_DATA_TYPES = ClassName.get("com.github.retrooper.packetevents.protocol.entity.data", "EntityDataTypes");

    private final JavadocGenerator javadocGenerator;

    public PropertyFieldGenerator(JavadocGenerator javadocGenerator) {
        this.javadocGenerator = javadocGenerator;
    }

    public FieldSpec generate(ClassName holderClass, PropertyNode prop, DataTypeMapper mapper) {
        FieldData lastVersionData = getLastVersionData(prop.getVersions());
        DataTypeMapping canonicalMapping = mapper.mapDataType(lastVersionData.rawDataType());

        TypeName innerType = prop.getTypeMapping().typeName();
        ClassName viewClass = mapper.getViewClass(holderClass.simpleName(), prop.getFieldName());

        ParameterizedTypeName propertyType = resolvePropertyType(innerType, viewClass);
        CodeBlock initBlock = buildInitializer(propertyType, prop, canonicalMapping, lastVersionData.rawDataType(), viewClass, mapper);

        CodeBlock javadocComment = this.javadocGenerator.generatePropertyJavadoc(prop, viewClass);

        return FieldSpec.builder(propertyType, prop.getFieldName())
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .addJavadoc(javadocComment)
                .initializer(initBlock)
                .build();
    }

    private ParameterizedTypeName resolvePropertyType(TypeName innerType, ClassName viewClass) {
        if (viewClass != null) {

            return ParameterizedTypeName.get(VIEW_PROPERTY, innerType, viewClass);
        }

        return ParameterizedTypeName.get(SIMPLE_PROPERTY, innerType);
    }

    private CodeBlock buildInitializer(ParameterizedTypeName propertyClass, PropertyNode prop, DataTypeMapping canonical, String canonicalRaw, ClassName viewClass, DataTypeMapper mapper) {

        CodeBlock.Builder builder = CodeBlock.builder();
        TypeName innerType = prop.getTypeMapping().typeName();

        if (viewClass != null) {
            builder.add("$T.builder($T::new)$>\n", propertyClass.rawType(), viewClass);
        } else {
            builder.add("$T.<$T>builder()$>\n", propertyClass.rawType(), innerType);
        }

        for (Map.Entry<String, FieldData> entry : prop.getVersions().entrySet()) {
            appendVersionMapping(builder, entry.getKey(), entry.getValue(), canonical, canonicalRaw, mapper);
        }

        return builder.add("$<.build()").build();
    }

    private void appendVersionMapping(CodeBlock.Builder builder, String version, FieldData data, DataTypeMapping canonical, String canonicalRaw, DataTypeMapper mapper) {
        String enumVersion = "V_" + version.replace('.', '_');
        DataTypeMapping versionMapping = mapper.mapDataType(data.rawDataType());

        boolean typesMatch = data.rawDataType().equals(canonicalRaw) ||
                (versionMapping != null && canonical != null &&
                        Objects.equals(versionMapping.packetEventsDataType(), canonical.packetEventsDataType()));

        if (versionMapping != null && !versionMapping.isExcluded() && typesMatch) {
            builder.add(".addVersion($T.$L, $L, $T.$L)\n",
                    CLIENT_VERSION, enumVersion, data.index(), ENTITY_DATA_TYPES, versionMapping.packetEventsDataType());
        } else {
            builder.add("// TODO type changed from '$L' to '$L', converter required\n",
                    data.rawDataType(), canonicalRaw);
        }
    }

    private FieldData getLastVersionData(Map<String, FieldData> sortedMap) {
        if (sortedMap.isEmpty()) {
            throw new IllegalStateException("Empty versions map encountered during code generation.");
        }
        return sortedMap.entrySet().stream().reduce((first, second) -> second).get().getValue();
    }

}
