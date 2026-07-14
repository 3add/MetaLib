package dev.threeadd.metalib.codegen.metaproperties.generator;

import com.palantir.javapoet.ClassName;
import com.palantir.javapoet.JavaFile;
import com.palantir.javapoet.MethodSpec;
import com.palantir.javapoet.TypeSpec;
import dev.threeadd.metalib.codegen.metaproperties.data.MetadataNode;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.EntityTypesIndex;

import javax.lang.model.element.Modifier;
import java.util.Locale;
import java.util.Map;

public class SchemaRegistryGenerator {

    private static final String OUTPUT_PACKAGE = "dev.threeadd.metalib.meta.protocol";
    private static final String META_PROPERTIES_PACKAGE = "dev.threeadd.metalib.meta.protocol.types";
    private static final String META_PACKAGE = "dev.threeadd.metalib.meta";
    private static final String ENTITY_TYPES_PACKAGE = "com.github.retrooper.packetevents.protocol.entity.type";

    private static final ClassName SCHEMA_REGISTRY = ClassName.get(META_PACKAGE, "MetadataSchemaRegistry");
    private static final ClassName ENTITY_TYPES = ClassName.get(ENTITY_TYPES_PACKAGE, "EntityTypes");

    private static final ClassName API_STATUS_INTERNAL = ClassName.get("org.jetbrains.annotations", "ApiStatus", "Internal");

    public JavaFile generate(Map<String, MetadataNode> aggregatedEntities) {
        System.out.println("Generating Schema Registry class file...");

        TypeSpec.Builder classBuilder = TypeSpec.classBuilder("EntityTypeSchemas")
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addAnnotation(API_STATUS_INTERNAL);

        MethodSpec.Builder initMethod = MethodSpec.methodBuilder("init")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC);

        for (MetadataNode node : aggregatedEntities.values()) {
            String constantName = convertClassNameToConstantFormat(node.getClassName());
            if (EntityTypesIndex.exists(constantName)) {
                ClassName metaClass = ClassName.get(META_PROPERTIES_PACKAGE, node.getClassName());

                initMethod.addStatement("$T.registerProvider($T.$L, () -> $T.SCHEMA)",
                        SCHEMA_REGISTRY, ENTITY_TYPES, constantName, metaClass);
            }
        }

        classBuilder.addMethod(initMethod.build());

        return JavaFile.builder(OUTPUT_PACKAGE, classBuilder.build())
                .addFileComment("Auto-generated file. Do not edit manually.\n")
                .indent("    ")
                .build();
    }

    private String convertClassNameToConstantFormat(String className) {
        String rawName = className.replace("MetaProperties", "");
        return rawName.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase(Locale.ROOT);
    }

}
