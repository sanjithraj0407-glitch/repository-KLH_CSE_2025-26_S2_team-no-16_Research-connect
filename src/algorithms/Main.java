package algorithms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String corpusPath = "corpus/research-papers";
        String resultsPath = "results/search_results.txt";

        SearchHistory history = new SearchHistory();

        try (Scanner scanner = new Scanner(System.in)) {

            Map<String, String> documents =
                    CorpusLoader.loadCorpus(corpusPath);

            System.out.println("==================================================");
            System.out.println("     RESEARCH PAPER PATTERN SEARCH SYSTEM");
            System.out.println("             Using KMP Algorithm");
            System.out.println("==================================================");

            System.out.println(
                    "Documents loaded: " + documents.size()
            );

            while (true) {

                System.out.print(
                        "\nEnter a pattern/keyword (or type exit): "
                );

                String pattern = scanner.nextLine().trim();

                if (pattern.equalsIgnoreCase("exit")) {

                    System.out.println("Program ended.");
                    break;
                }

                if (pattern.isEmpty()) {

                    System.out.println(
                            "Please enter a pattern."
                    );

                    continue;
                }

                history.add(pattern);

                boolean found = false;

                StringBuilder resultText = new StringBuilder();

                resultText.append("RESEARCH PAPER PATTERN SEARCH RESULTS\n");
                resultText.append("======================================\n\n");
                resultText.append("Search Pattern: \"")
                          .append(pattern)
                          .append("\"\n\n");

                System.out.println(
                        "\nSearch results for: \"" + pattern + "\""
                );

                System.out.println(
                        "--------------------------------------------------"
                );

                for (Map.Entry<String, String> entry
                        : documents.entrySet()) {

                    List<Integer> positions =
                            KMP.search(entry.getValue(), pattern);

                    if (!positions.isEmpty()) {

                        found = true;

                        System.out.println(
                                "Document   : " + entry.getKey()
                        );

                        System.out.println(
                                "Occurrences: " + positions.size()
                        );

                        System.out.println(
                                "Positions  : " + positions
                        );

                        System.out.println();

                        resultText.append(
                                "Document   : "
                        ).append(entry.getKey()).append("\n");

                        resultText.append(
                                "Occurrences: "
                        ).append(positions.size()).append("\n");

                        resultText.append(
                                "Positions  : "
                        ).append(positions).append("\n\n");
                    }
                }

                if (!found) {

                    System.out.println(
                            "Pattern was not found in the corpus."
                    );

                    resultText.append(
                            "Pattern was not found in the corpus.\n"
                    );
                }

                // Create results folder if it does not exist
                Path resultsFolder = Paths.get("results");

                if (!Files.exists(resultsFolder)) {
                    Files.createDirectories(resultsFolder);
                }

                // Save search results
                Files.writeString(
                        Paths.get(resultsPath),
                        resultText.toString()
                );

                System.out.println(
                        "Result saved to: " + resultsPath
                );
            }

        } catch (IOException e) {

            System.out.println(
                    "Error: " + e.getMessage()
            );
        }
    }
}