package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SuffixArrayTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        SUFFIX ARRAY TEST");
        System.out.println("=================================");

        System.out.print("Enter any word/text: ");
        String text = scanner.nextLine();

        int[] actual = SuffixArray.buildSuffixArray(text);

        System.out.println("Text: " + text);
        System.out.println("Suffix Array: " + Arrays.toString(actual));

        scanner.close();
    }
}