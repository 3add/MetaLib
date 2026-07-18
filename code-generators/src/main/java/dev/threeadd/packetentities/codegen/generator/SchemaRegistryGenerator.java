package dev.threeadd.packetentities.codegen.generator;

import com.palantir.javapoet.*;
import dev.threeadd.packetentities.codegen.data.MetadataNode;
import dev.threeadd.packetentities.codegen.data.mapping.EntityTypesIndex;

import javax.lang.model.element.Modifier;
import java.util.Locale;
import java.util.Map;

public class SchemaRegistryGenerator {

    private static final String OUTPUT_PACKAGE = "dev.threeadd.packetentities.meta.protocol";
    private static final String OUTER_CLASS_NAME = "EntityMetaFields";
    private static final String META_PACKAGE = "dev.threeadd.packetentities.meta";
    private static final String ENTITY_TYPES_PACKAGE = "com.github.retrooper.packetevents.protocol.entity.type";

    private static final ClassName SCHEMA_REGISTRY = ClassName.get(META_PACKAGE, "EntityMetaSchemaRegistry");
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

                String cleanClassName = node.getClassName();
                ClassName metaClass = ClassName.get(OUTPUT_PACKAGE, OUTER_CLASS_NAME, cleanClassName);

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
        return className.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase(Locale.ROOT);
    }

}
