package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class ZAlgorithmTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        Z ALGORITHM TEST");
        System.out.println("=================================");

        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.print("Enter pattern: ");
        String pattern = scanner.nextLine();

        String combined = pattern + "$" + text;

        int[] z = ZAlgorithm.buildZArray(combined);

        int count = 0;

        System.out.print("Positions: [");

        for (int i = pattern.length() + 1; i < z.length; i++) {

            if (z[i] >= pattern.length()) {

                if (count > 0) {
                    System.out.print(", ");
                }

                System.out.print(i - pattern.length() - 1);
                count++;
            }
        }

        System.out.println("]");

        System.out.println("Text       : " + text);
        System.out.println("Pattern    : " + pattern);
        System.out.println("Occurrences: " + count);

        if (count > 0) {
            System.out.println(
                    "Z Algorithm search PASSED - pattern found."
            );
        } else {
            System.out.println(
                    "Z Algorithm search completed - pattern not found."
            );
        }

        scanner.close();
    }
}