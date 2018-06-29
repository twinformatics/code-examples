package at.twinformatics.scalademo.java;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import static java.nio.file.Files.readAllBytes;

/**
 * Simple exception handling example in Java. The checked `IOException`, thrown
 * by the `readAllBytes` method, must be handled.
 */
public class ExceptionHandling {

    Optional<String> readText(Path file) {
        try {
            return Optional.of(new String(readAllBytes(file)));
        } catch (IOException e) {
            return Optional.empty();
        }
    }

}
