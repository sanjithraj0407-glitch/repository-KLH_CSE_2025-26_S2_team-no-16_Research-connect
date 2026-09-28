package algorithms;

import java.util.*;

public class AhoCorasick {

    private static class Node {
        Map<Character, Node> children = new HashMap<>();
        Node failure;
        List<String> outputs = new ArrayList<>();
    }

    private final Node root = new Node();

    public void addPattern(String pattern) {

        Node current = root;

        for (char ch : pattern.toLowerCase().toCharArray()) {
            current = current.children.computeIfAbsent(
                    ch, k -> new Node()
            );
        }

        current.outputs.add(pattern);
    }

    public void build() {

        Queue<Node> queue = new LinkedList<>();

        root.failure = root;

        for (Node child : root.children.values()) {
            child.failure = root;
            queue.add(child);
        }

        while (!queue.isEmpty()) {

            Node current = queue.poll();

            for (Map.Entry<Character, Node> entry :
                    current.children.entrySet()) {

                char ch = entry.getKey();
                Node child = entry.getValue();

                Node failure = current.failure;

                while (failure != root &&
                        !failure.children.containsKey(ch)) {

                    failure = failure.failure;
                }

                if (failure.children.containsKey(ch)
                        && failure.children.get(ch) != child) {

                    child.failure = failure.children.get(ch);

                } else {
                    child.failure = root;
                }

                child.outputs.addAll(child.failure.outputs);

                queue.add(child);
            }
        }
    }

    public Map<String, List<Integer>> search(String text) {

        Map<String, List<Integer>> results =
                new LinkedHashMap<>();

        Node current = root;

        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {

            char ch = lowerText.charAt(i);

            while (current != root &&
                    !current.children.containsKey(ch)) {

                current = current.failure;
            }

            if (current.children.containsKey(ch)) {
                current = current.children.get(ch);
            }

            for (String pattern : current.outputs) {

                int position =
                        i - pattern.length() + 1;

                results
                    .computeIfAbsent(
                            pattern,
                            k -> new ArrayList<>()
                    )
                    .add(position);
            }
        }

        return results;
    }
}