package cl.ravenhill.io;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;

public class AutoCloseableFileProcessor {
    public static @NotNull String processFile(String fileName) {
        try (var reader = new BufferedReader(new FileReader(fileName))) {
            var content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (java.io.FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(processFile("intro/exceptions/src/main/java/cl/ravenhill/io/AutoCloseableFileProcessor.java"));
        System.out.println(processFile("intro/exceptions/src/main/java/cl/ravenhill/io/NonExistentFile.java"));
        /* Output:
        package cl.ravenhill.io;package cl.ravenhill.io;

        import org.jetbrains.annotations.NotNull;

        ...

        File not found: intro\exceptions\src\main\java\cl\ravenhill\io\NonExistentFile.java (The system cannot find the file specified)
         */
    }
}
