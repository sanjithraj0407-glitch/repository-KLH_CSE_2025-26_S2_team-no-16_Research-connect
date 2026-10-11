
package algorithms;

import java.util.*;

public class MonteCarloSearchTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> documents = new LinkedHashMap<>();

        documents.put("paper1.txt",
                "Machine learning helps computers learn from data.");

        documents.put("paper2.txt",
                "Cybersecurity protects systems and networks.");

        documents.put("paper3.txt",
                "Machine learning is used in artificial intelligence.");

        documents.put("paper4.txt",
                "Cloud computing provides online computing resources.");

        documents.put("paper5.txt",
                "Deep learning is a branch of machine learning.");

        System.out.println("====================================");
        System.out.println("    MONTE CARLO SEARCH DEMO");
        System.out.println("====================================");

        System.out.print("Enter keyword: ");
        String keyword = scanner.nextLine();

        System.out.print("Number of documents to sample (1-5): ");
        int sampleSize = scanner.nextInt();

        if (sampleSize < 1 || sampleSize > documents.size()) {
            System.out.println("Please enter a number from 1 to 5.");
            scanner.close();
            return;
        }

        List<String> results = MonteCarloSearch.search(
                documents, keyword, sampleSize, System.nanoTime());

        System.out.println();
        System.out.println("Total documents: " + documents.size());
        System.out.println("Documents sampled: " + sampleSize);
        System.out.println("Matching documents in sample: " + results);

        System.out.println();
        System.out.println("Randomized sampling demonstration completed.");

        scanner.close();
    }
}
