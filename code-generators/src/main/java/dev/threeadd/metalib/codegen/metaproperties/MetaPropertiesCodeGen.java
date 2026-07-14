package dev.threeadd.metalib.codegen.metaproperties;

import com.palantir.javapoet.JavaFile;
import dev.threeadd.metalib.codegen.metaproperties.data.MetadataNode;
import dev.threeadd.metalib.codegen.metaproperties.data.fetch.MetaDataFetcher;
import dev.threeadd.metalib.codegen.metaproperties.generator.JavadocGenerator;
import dev.threeadd.metalib.codegen.metaproperties.generator.MetaPropertiesClassGenerator;
import dev.threeadd.metalib.codegen.metaproperties.generator.SchemaRegistryGenerator;
import dev.threeadd.metalib.codegen.metaproperties.io.DiskOutputWriter;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.DataTypeMapper;

import java.io.IOException;
import java.net.http.HttpClient;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class MetaPropertiesCodeGen {

    public static final String VERSIONS_URL = "https://kennytv.eu/entity-data/versions.json";
    public static final String DATA_URL_FORMAT = "https://kennytv.eu/entity-data/%s.json";
    private static final Set<String> EXCLUDED_VERSIONS = Set.of();

    public static final Comparator<String> VERSION_COMPARATOR = (v1, v2) -> {
        String[] p1 = v1.split("\\.");
        String[] p2 = v2.split("\\.");
        int length = Math.max(p1.length, p2.length);
        for (int i = 0; i < length; i++) {
            int n1 = i < p1.length ? Integer.parseInt(p1[i]) : 0;
            int n2 = i < p2.length ? Integer.parseInt(p2[i]) : 0;
            if (n1 != n2) return Integer.compare(n1, n2);
        }
        return 0;
    };

    public static void main(String[] args) {
        String rawOutputDir = (args.length > 0) ? args[0] : "output";
        Path baseDir = Paths.get(System.getProperty("user.dir"))
                .resolve(rawOutputDir)
                .toAbsolutePath()
                .normalize();

        System.out.println("Starting MetaProperties code generator. Outputting to base directory: " + baseDir);

        DiskOutputWriter outputWriter = new DiskOutputWriter(baseDir);
        DataTypeMapper mapper = new DataTypeMapper();

        try (HttpClient client = HttpClient.newHttpClient()) {
            MetaDataFetcher fetcher = new MetaDataFetcher(VERSIONS_URL, DATA_URL_FORMAT, EXCLUDED_VERSIONS);

            List<String> fullVersions = fetcher.fetchVersions(client);
            fullVersions.sort(VERSION_COMPARATOR);

            Map<String, MetadataNode> metas = fetcher.fetchAndAggregateMetas(client, fullVersions, mapper);

            JavadocGenerator javadocGenerator = new JavadocGenerator(fullVersions);
            MetaPropertiesClassGenerator classGenerator = new MetaPropertiesClassGenerator(mapper, javadocGenerator);

            List<MetadataNode> sortedEntities = getTopologicallySortedEntities(metas);

            System.out.println("Generating class files...");
            for (MetadataNode node : sortedEntities) {
                try {
                    MetadataNode superClass = (node.getSuperClassName() != null)
                            ? metas.get(node.getSuperClassName())
                            : null;

                    JavaFile compiledJavaFile = classGenerator.generate(node, superClass);

                    outputWriter.write(compiledJavaFile);
                } catch (Exception e) {
                    System.err.println("Failed to write class " + node.getClassName() + ": " + e.getMessage());
                }
            }

            System.out.println("Generating schema registry...");
            SchemaRegistryGenerator registryGenerator = new SchemaRegistryGenerator();
            outputWriter.write(registryGenerator.generate(metas));

            System.out.println("All meta properties generated cleanly.");

        } catch (IOException | InterruptedException e) {
            throw new IllegalStateException("Something failed whilst trying to generate the classes", e);
        }
    }

    private static List<MetadataNode> getTopologicallySortedEntities(Map<String, MetadataNode> aggregatedEntities) {
        List<MetadataNode> sortedResult = new ArrayList<>();
        Set<String> visited = new HashSet<>();

        List<String> sortedKeys = aggregatedEntities.keySet().stream().sorted().toList();

        for (String className : sortedKeys) {
            visitNode(className, aggregatedEntities, visited, sortedResult);
        }

        return sortedResult;
    }

    private static void visitNode(String className, Map<String, MetadataNode> map, Set<String> visited, List<MetadataNode> result) {
        if (className == null || visited.contains(className)) return;

        MetadataNode node = map.get(className);
        if (node == null) return;

        if (node.getSuperClassName() != null) {
            visitNode(node.getSuperClassName(), map, visited, result);
        }

        visited.add(className);
        result.add(node);
    }

}
