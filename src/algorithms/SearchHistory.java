package algorithms;

import java.util.ArrayList;
import java.util.List;

public class SearchHistory {

    private final List<String> history = new ArrayList<>();

    public void add(String pattern) {
        history.add(pattern);
    }

    public void display() {

        if (history.isEmpty()) {
            System.out.println("No searches yet.");
            return;
        }

        System.out.println("\nSearch History:");

        for (int i = 0; i < history.size(); i++) {
            System.out.println((i + 1) + ". " + history.get(i));
        }
    }
}