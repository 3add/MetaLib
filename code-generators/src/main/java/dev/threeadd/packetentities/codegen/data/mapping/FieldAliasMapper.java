package dev.threeadd.packetentities.codegen.data.mapping;

import dev.threeadd.packetentities.codegen.data.EntityMetaNode;
import dev.threeadd.packetentities.codegen.data.FieldNode;

import java.util.Map;

public final class FieldAliasMapper {

    // Map of ClassName -> (OldFieldName -> LatestFieldName)
    private static final Map<String, Map<String, String>> ALIASES = Map.of(
            "Entity", Map.of(
                    "FLAGS", "SHARED_FLAGS",
                    "AIR", "AIR_SUPPLY"
            )
    );

    private FieldAliasMapper() {
    }

    public static void mergeAliases(EntityMetaNode node) {
        Map<String, String> classAliases = ALIASES.get(node.getClassName());
        if (classAliases == null) {
            return;
        }

        Map<String, FieldNode> fields = node.getFields(); //[cite: 11]

        for (Map.Entry<String, String> entry : classAliases.entrySet()) {
            String oldName = entry.getKey();
            String latestName = entry.getValue();

            if (fields.containsKey(oldName) && fields.containsKey(latestName)) {
                FieldNode oldField = fields.get(oldName);
                FieldNode latestField = fields.get(latestName);

                latestField.getVersions().putAll(oldField.getVersions());

                fields.remove(oldName);
            }
        }
    }

}
