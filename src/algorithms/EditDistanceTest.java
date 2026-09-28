package algorithms;

import java.util.Scanner;

public class EditDistanceTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("       EDIT DISTANCE TEST");
        System.out.println("=================================");

        System.out.print("Enter first word/text: ");
        String word1 = scanner.nextLine();

        System.out.print("Enter second word/text: ");
        String word2 = scanner.nextLine();

        int distance = EditDistance.calculate(word1, word2);

        System.out.println();
        System.out.println("Word 1: " + word1);
        System.out.println("Word 2: " + word2);
        System.out.println("Edit Distance: " + distance);

        scanner.close();
    }
}