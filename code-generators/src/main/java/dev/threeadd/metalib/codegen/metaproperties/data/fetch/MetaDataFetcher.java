package dev.threeadd.metalib.codegen.metaproperties.data.fetch;

import com.google.gson.*;
import dev.threeadd.metalib.codegen.metaproperties.data.mapping.DataTypeMapper;
import dev.threeadd.metalib.codegen.metaproperties.data.MetadataNode;
import dev.threeadd.metalib.codegen.metaproperties.data.PropertyNode;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class MetaDataFetcher {

    private final String versionsUrl;
    private final String dataUrlFormat;
    private final Set<String> excludedVersions;

    public MetaDataFetcher(String versionsUrl, String dataUrlFormat, Set<String> excludedVersions) {
        this.versionsUrl = versionsUrl;
        this.dataUrlFormat = dataUrlFormat;
        this.excludedVersions = excludedVersions;
    }

    public List<String> fetchVersions(HttpClient client) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.versionsUrl)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonElement parsedElement = JsonParser.parseString(response.body());
        List<String> filtered = new ArrayList<>();

        if (parsedElement != null && parsedElement.isJsonArray()) {
            for (JsonElement obj : parsedElement.getAsJsonArray()) {
                String version = obj.getAsString();

                if (!version.matches("^\\d+(\\.\\d+)*$")) {
                    continue;
                }

                if (!this.excludedVersions.contains(version)) {
                    filtered.add(version);
                }
            }
        }
        return filtered;
    }

    public Map<String, MetaData> fetchVersionSnapshot(HttpClient client, String version) throws IOException, InterruptedException {
        String url = String.format(this.dataUrlFormat, version);
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        JsonElement parsedElement = JsonParser.parseString(response.body());
        Map<String, MetaData> versionEntities = new HashMap<>();

        if (parsedElement != null && parsedElement.isJsonObject()) {
            JsonObject rootObject = parsedElement.getAsJsonObject();

            for (Map.Entry<String, JsonElement> metaEntry : rootObject.entrySet()) {
                String rawType = metaEntry.getKey();
                if (!metaEntry.getValue().isJsonObject()) continue;
                JsonObject metaObj = metaEntry.getValue().getAsJsonObject();

                String superClass = null;
                if (metaObj.has("superClass") && !metaObj.get("superClass").isJsonNull()) {
                    String rawSuperClass = metaObj.get("superClass").getAsString();
                    superClass = cleanClassName(rawSuperClass) + "MetaProperties";
                }

                Map<String, FieldData> fieldsMap = new HashMap<>();
                if (metaObj.has("fields") && metaObj.get("fields").isJsonArray()) {
                    JsonArray fieldsArray = metaObj.getAsJsonArray("fields");
                    for (JsonElement fieldElement : fieldsArray) {
                        if (!fieldElement.isJsonObject()) continue;
                        JsonObject fieldObj = fieldElement.getAsJsonObject();

                        int index = fieldObj.get("index").getAsInt();
                        String dataType = fieldObj.get("dataType").getAsString();
                        String fieldName = fieldObj.get("fieldName").getAsString();

                        fieldsMap.put(fieldName, new FieldData(index, dataType));
                    }
                }

                versionEntities.put(rawType, new MetaData(superClass, fieldsMap));
            }
        }

        return versionEntities;
    }

    public Map<String, MetadataNode> fetchAndAggregateMetas(HttpClient client, List<String> versions, DataTypeMapper mapper) throws IOException, InterruptedException {
        Map<String, MetadataNode> entities = new TreeMap<>();

        for (String version : versions) {
            if (this.excludedVersions.contains(version)) continue;

            System.out.println("Fetching snapshot layouts for Minecraft version: " + version);
            Map<String, MetaData> versionSnapshot = fetchVersionSnapshot(client, version);

            for (Map.Entry<String, MetaData> entry : versionSnapshot.entrySet()) {
                String rawType = entry.getKey();
                MetaData rawMeta = entry.getValue();

                String className = cleanClassName(rawType) + "MetaProperties";
                MetadataNode aggregatedNode = entities.computeIfAbsent(className, MetadataNode::new);
                aggregatedNode.getSupportedVersions().add(version);

                if (rawMeta.rawSuperClassName() != null) {
                    aggregatedNode.setSuperClassName(rawMeta.rawSuperClassName());
                }

                for (Map.Entry<String, FieldData> fieldEntry : rawMeta.fields().entrySet()) {
                    String fieldName = fieldEntry.getKey();
                    FieldData rawField = fieldEntry.getValue();

                    PropertyNode propertyNode = aggregatedNode.getProperties().computeIfAbsent(fieldName, PropertyNode::new);
                    propertyNode.setTypeMapping(mapper.mapDataType(rawField.rawDataType()));
                    propertyNode.getVersions().put(version, rawField);
                }
            }
        }

        return entities;
    }

    private String cleanClassName(String rawInput) {
        if (rawInput.isEmpty()) throw new IllegalStateException("Input was null or empty");
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;
        for (char c : rawInput.toCharArray()) {
            if (c == ' ' || c == '_' || c == '-') {
                capitalizeNext = true;
            } else if (capitalizeNext) {
                sb.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
