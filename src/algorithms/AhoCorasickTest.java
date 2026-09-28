package algorithms;

import java.util.List;
import java.util.Map;

public class AhoCorasickTest {

    public static void main(String[] args) {

        AhoCorasick ac = new AhoCorasick();

        ac.addPattern("machine learning");
        ac.addPattern("deep learning");
        ac.addPattern("cybersecurity");

        ac.build();

        String text =
                "Machine learning and deep learning are used in cybersecurity.";

        Map<String, List<Integer>> results = ac.search(text);

        System.out.println("Text: " + text);
        System.out.println("Pattern Search Results:");

        for (Map.Entry<String, List<Integer>> entry
                : results.entrySet()) {

            System.out.println(
                    entry.getKey() + " -> " + entry.getValue()
            );
        }

        if (!results.isEmpty()) {
            System.out.println("Aho-Corasick test PASSED.");
        } else {
            System.out.println("Aho-Corasick test FAILED.");
        }
    }
}