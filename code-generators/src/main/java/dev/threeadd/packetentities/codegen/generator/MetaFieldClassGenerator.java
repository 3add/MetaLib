package dev.threeadd.packetentities.codegen.generator;

import com.palantir.javapoet.*;
import dev.threeadd.packetentities.codegen.data.MetadataNode;
import dev.threeadd.packetentities.codegen.data.PropertyNode;
import dev.threeadd.packetentities.codegen.data.mapping.DataTypeMapper;
import dev.threeadd.packetentities.codegen.data.mapping.EntityTypeMapper;
import dev.threeadd.packetentities.codegen.data.mapping.EntityTypesIndex;

import javax.lang.model.element.Modifier;
import java.util.List;

public class MetaFieldClassGenerator {

    private static final String OUTPUT_PACKAGE = "dev.threeadd.packetentities.meta.protocol";
    private static final String OUTER_CLASS_NAME = "EntityMetaFields";
    private static final String META_PACKAGE = "dev.threeadd.packetentities.meta";
    private static final String ENTITY_TYPES_PACKAGE = "com.github.retrooper.packetevents.protocol.entity.type";

    private static final ClassName PROPERTY_HOLDER = ClassName.get("dev.threeadd.packetentities.meta.field", "IEntityMetaFieldHolder");
    private static final ClassName METADATA_SCHEMA = ClassName.get(META_PACKAGE, "EntityMetaSchema");
    private static final ClassName ENTITY_TYPES = ClassName.get(ENTITY_TYPES_PACKAGE, "EntityTypes");

    private final DataTypeMapper mapper;
    private final FieldGenerator fieldGenerator;

    public MetaFieldClassGenerator(DataTypeMapper mapper, JavadocGenerator javadocGenerator) {
        this.mapper = mapper;
        this.fieldGenerator = new FieldGenerator(javadocGenerator);
    }

    public JavaFile generate(List<MetadataNode> sortedEntities) {
        TypeSpec.Builder outerClassBuilder = TypeSpec.classBuilder(OUTER_CLASS_NAME)
                .addAnnotation(AnnotationSpec.builder(SuppressWarnings.class)
                        .addMember("value", "$S", "unused")
                        .build())
                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                .addJavadoc("Container for all auto-generated packet entity metadata schemas and fields.\n");

        for (MetadataNode node : sortedEntities) {
            TypeSpec innerClass = generateInnerClass(node);
            outerClassBuilder.addType(innerClass);
        }

        return JavaFile.builder(OUTPUT_PACKAGE, outerClassBuilder.build())
                .addFileComment("Auto-generated file. Do not edit manually.\n")
                .skipJavaLangImports(true)
                .indent("    ")
                .build();
    }

    private TypeSpec generateInnerClass(MetadataNode node) {
        String cleanClassName = node.getClassName();

        TypeSpec.Builder classBuilder = TypeSpec.classBuilder(cleanClassName)
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .addJavadoc(this.fieldGenerator.getJavadocGenerator().generateClassJavadoc(node));

        if (node.getSuperClassName() != null && !node.getSuperClassName().isEmpty()) {
            String cleanSuperName = node.getSuperClassName();
            // Providing an empty package prevents JavaPoet from prepending the outer class name
            classBuilder.superclass(ClassName.get("", cleanSuperName));
        } else {
            classBuilder.addSuperinterface(PROPERTY_HOLDER);
        }

        ClassName selfClass = ClassName.get("", cleanClassName);

        for (PropertyNode prop : node.getProperties().values()) {
            classBuilder.addField(this.fieldGenerator.generate(selfClass, prop, this.mapper));
        }

        classBuilder.addField(buildSchemaField(node, selfClass));

        return classBuilder.build();
    }

    private FieldSpec buildSchemaField(MetadataNode node, ClassName selfClass) {
        CodeBlock.Builder initializer = CodeBlock.builder();

        String constantName = EntityTypeMapper.resolveConstantName(node.getClassName());

        if (node.getSuperClassName() != null && !node.getSuperClassName().isEmpty()) {
            String cleanSuperName = node.getSuperClassName();
            ClassName superMetaProperties = ClassName.get("", cleanSuperName);

            if (EntityTypesIndex.exists(constantName)) {
                initializer.add("$T.$N.extend($T.$L)$>", superMetaProperties, "SCHEMA", ENTITY_TYPES, constantName);
            } else {
                initializer.add("$T.$N.extend($L)$> // TODO Entity Type need mappings", superMetaProperties, "SCHEMA", "null");
            }
        } else {
            initializer.add("$T.builder($T.$L)$>", METADATA_SCHEMA, ENTITY_TYPES, "ENTITY");
        }

        for (PropertyNode prop : node.getProperties().values()) {
            initializer.add("\n.add($T.$L)", selfClass, prop.getFieldName());
        }

        initializer.add("\n.build()$<");

        return FieldSpec.builder(METADATA_SCHEMA, "SCHEMA")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC, Modifier.FINAL)
                .addJavadoc("""
                        The {@link $T} containing this meta's properties, combined with all
                        properties declared by its super classes.
                        """, METADATA_SCHEMA)
                .initializer(initializer.build())
                .build();
    }

}
