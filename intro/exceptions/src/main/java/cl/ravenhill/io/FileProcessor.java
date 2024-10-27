package cl.ravenhill.io;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

public class FileProcessor {
    @NotNull
    public static String processFile(String fileName) {
        Optional<BufferedReader> reader = Optional.empty();
        var content = new StringBuilder();
        try {
            var file = new File(fileName);
            reader = Optional.of(new BufferedReader(new java.io.FileReader(file)));
            String line;
            while ((line = reader.get().readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } finally {
            reader.ifPresent(r -> {
                try {
                    r.close();
                } catch (IOException e) {
                    System.err.println("Error closing file: " + e.getMessage());
                }
            });
        }
        return content.toString();
    }

    public static void main(String[] args) {
        System.out.println(processFile("intro/exceptions/src/main/java/cl/ravenhill/io/FileProcessor.java"));
        System.out.println(processFile("intro/exceptions/src/main/java/cl/ravenhill/io/NonExistentFile.java"));
        /* Output:

         */
    }
}
