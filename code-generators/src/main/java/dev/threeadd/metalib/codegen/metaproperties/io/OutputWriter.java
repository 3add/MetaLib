package dev.threeadd.metalib.codegen.metaproperties.io;

import com.palantir.javapoet.JavaFile;
import java.io.IOException;

public interface OutputWriter {

    void write(JavaFile javaFile) throws IOException;

}
