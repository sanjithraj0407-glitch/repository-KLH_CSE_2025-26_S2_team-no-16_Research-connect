package algorithms;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class CorpusLoader {

    public static Map<String, String> loadCorpus(String folderPath)
            throws IOException {

        Map<String, String> documents = new LinkedHashMap<>();

        Path folder = Paths.get(folderPath);

        if (!Files.exists(folder)) {
            throw new IOException(
                    "Corpus folder not found: "
                    + folder.toAbsolutePath()
            );
        }

        // Search inside the main folder and all subfolders
        try (var paths = Files.walk(folder)) {

            paths.filter(Files::isRegularFile)
                 .filter(path -> path.toString()
                         .toLowerCase()
                         .endsWith(".txt"))
                 .forEach(file -> {

                     try {
                         String relativePath =
                                 folder.relativize(file).toString();

                         String content =
                                 Files.readString(file);

                         documents.put(relativePath, content);

                     } catch (IOException e) {
                         System.out.println(
                                 "Could not read: " + file
                         );
                     }
                 });
        }

        return documents;
    }
}