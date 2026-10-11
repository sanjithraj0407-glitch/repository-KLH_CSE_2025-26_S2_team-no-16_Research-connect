
package algorithms;

import java.util.*;

public class MonteCarloSearch {

    public static List<String> search(
            Map<String, String> documents,
            String keyword,
            int sampleSize,
            long seed) {

        List<String> results = new ArrayList<>();

        if (keyword == null || keyword.isEmpty()
                || sampleSize <= 0 || documents.isEmpty()) {
            return results;
        }

        List<String> names = new ArrayList<>(documents.keySet());
        Collections.shuffle(names, new Random(seed));

        int limit = Math.min(sampleSize, names.size());

        for (int i = 0; i < limit; i++) {
            String name = names.get(i);
            String content = documents.get(name);

            if (content != null &&
                    content.toLowerCase(Locale.ROOT)
                    .contains(keyword.toLowerCase(Locale.ROOT))) {
                results.add(name);
            }
        }

        return results;
    }
}
