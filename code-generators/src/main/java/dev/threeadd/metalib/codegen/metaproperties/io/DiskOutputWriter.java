package dev.threeadd.metalib.codegen.metaproperties.io;

import com.palantir.javapoet.JavaFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * {@link JavaFile#writeTo(Path)} doesn't let you post process, manual implementation
 */
public class DiskOutputWriter implements OutputWriter {

    private final Path baseDir;

    public DiskOutputWriter(Path baseDir) {
        this.baseDir = baseDir;
    }

    @Override
    public void write(JavaFile javaFile) throws IOException {
        StringBuilder sb = new StringBuilder();
        javaFile.writeTo(sb);

        String source = formatClassBody(sb.toString());

        Path outputDir = this.baseDir;
        if (!javaFile.packageName().isEmpty()) {
            for (String packageComponent : javaFile.packageName().split("\\.")) {
                outputDir = outputDir.resolve(packageComponent);
            }
        }

        Files.createDirectories(outputDir);
        Path outputPath = outputDir.resolve(javaFile.typeSpec().name() + ".java");

        Files.writeString(outputPath, source);
    }

    private static String formatClassBody(String source) {
        // adds empty line after opening brace
        source = source.replaceAll("\\{\n(?!\\n)(\\s+\\S)", "{\n\n$1");

        // adds empty line before closing braces of methods/blocks
        source = source.replaceAll("(?<!\\n)\\n(\\s*\\}\\s*\\n)", "\n\n$1");

        // forces an empty line before the final closing brace of the class
        source = source.replaceAll("(\\s*\\})\\n\\}\\s*$", "$1\n\n}\n");

        return source;
    }

}
