package at.twinformatics.scalademo.java;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import static java.nio.file.Files.readAllBytes;

public class ExceptionHandling {

    Optional<String> readText(Path file) {
        try {
            return Optional.of(new String(readAllBytes(file)));
        } catch (IOException e) {
            return Optional.empty();
        }
    }

}
