package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAPI {

    void method() throws IOException {
        // Files.writeString
        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 features");

        // Files.readString
        String str = Files.readString(path);
    }
}
