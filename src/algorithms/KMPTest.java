package algorithms;

import java.util.List;
import java.util.Scanner;

public class KMPTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("          KMP TEST");
        System.out.println("=================================");

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = scanner.nextLine();

        List<Integer> positions = KMP.search(text, pattern);

        System.out.println();
        System.out.println("Text     : " + text);
        System.out.println("Pattern  : " + pattern);
        System.out.println("Positions: " + positions);
        System.out.println("Occurrences: " + positions.size());

        if (!positions.isEmpty()) {
            System.out.println("KMP search PASSED - pattern found.");
        } else {
            System.out.println("KMP search completed - pattern not found.");
        }

        scanner.close();
    }
}