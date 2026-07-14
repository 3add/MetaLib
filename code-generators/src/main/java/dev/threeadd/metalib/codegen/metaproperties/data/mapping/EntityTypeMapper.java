package dev.threeadd.metalib.codegen.metaproperties.data.mapping;

import java.util.Locale;
import java.util.Map;

public final class EntityTypeMapper {

    private static final Map<String, String> MANUAL_OVERRIDES = Map.ofEntries(
            Map.entry("AbstractFishMetaProperties", "ABSTRACT_FISHES"),
            Map.entry("AvatarMetaProperties", "PLAYER"),
            Map.entry("EntityMetaProperties", "ENTITY")
    );

    private EntityTypeMapper() {
    }

    public static String defaultConstantName(String metaClassName) {
        String rawName = metaClassName.replace("MetaProperties", "");
        return rawName.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase(Locale.ENGLISH);
    }

    public static String resolveConstantName(String metaClassName) {
        String override = MANUAL_OVERRIDES.get(metaClassName);
        return override != null ? override : defaultConstantName(metaClassName);
    }

}
