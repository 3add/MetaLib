package dev.threeadd.metalib.codegen.metaproperties.generator;

import com.palantir.javapoet.*;
import dev.threeadd.metalib.codegen.metaproperties.data.MetadataNode;
import dev.threeadd.metalib.codegen.metaproperties.data.PropertyNode;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.DataTypeMapper;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.EntityTypeMapper;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.EntityTypesIndex;

import javax.lang.model.element.Modifier;

public class MetaPropertiesClassGenerator {

    private static final String OUTPUT_PACKAGE = "dev.threeadd.metalib.meta.protocol.types";
    private static final String META_PACKAGE = "dev.threeadd.metalib.meta";
    private static final String ENTITY_TYPES_PACKAGE = "com.github.retrooper.packetevents.protocol.entity.type";

    private static final ClassName PROPERTY_HOLDER = ClassName.get("dev.threeadd.metalib.meta.property", "IMetadataPropertyHolder");
    private static final ClassName METADATA_SCHEMA = ClassName.get(META_PACKAGE, "MetadataSchema");
    private static final ClassName ENTITY_TYPES = ClassName.get(ENTITY_TYPES_PACKAGE, "EntityTypes");

    private final DataTypeMapper mapper;
    private final JavadocGenerator javadocGenerator;
    private final PropertyFieldGenerator fieldGenerator;

    public MetaPropertiesClassGenerator(DataTypeMapper mapper, JavadocGenerator javadocGenerator) {
        this.mapper = mapper;
        this.javadocGenerator = javadocGenerator;
        this.fieldGenerator = new PropertyFieldGenerator(javadocGenerator);
    }

    public JavaFile generate(MetadataNode node, MetadataNode superClass) {
        TypeSpec.Builder classBuilder = TypeSpec.classBuilder(node.getClassName())
                .addModifiers(Modifier.PUBLIC)
                .addJavadoc(this.javadocGenerator.generateClassJavadoc(node));

        if (superClass != null) {
            classBuilder.superclass(ClassName.get(OUTPUT_PACKAGE, superClass.getClassName()));
        } else {
            classBuilder.addSuperinterface(PROPERTY_HOLDER);
        }

        ClassName selfClass = ClassName.get(OUTPUT_PACKAGE, node.getClassName());

        for (PropertyNode prop : node.getProperties().values()) {
            classBuilder.addField(this.fieldGenerator.generate(selfClass, prop, this.mapper));
        }

        classBuilder.addField(buildSchemaField(node, superClass, selfClass));

        return JavaFile.builder(OUTPUT_PACKAGE, classBuilder.build())
                .addFileComment("Auto-generated file. Do not edit manually.\n")
                .skipJavaLangImports(true)
                .indent("    ")
                .build();
    }

    private FieldSpec buildSchemaField(MetadataNode node, MetadataNode superClass, ClassName selfClass) {
        CodeBlock.Builder initializer = CodeBlock.builder();

        String constantName = EntityTypeMapper.resolveConstantName(node.getClassName());
        if (superClass != null) {
            ClassName superMetaProperties = ClassName.get(OUTPUT_PACKAGE, superClass.getClassName());

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
