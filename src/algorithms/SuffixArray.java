package algorithms;

import java.util.Arrays;

public class SuffixArray {

    public static int[] buildSuffixArray(String text) {

        int n = text.length();

        Integer[] suffixes = new Integer[n];

        for (int i = 0; i < n; i++) {
            suffixes[i] = i;
        }

        Arrays.sort(suffixes, (a, b) ->
                text.substring(a).compareTo(text.substring(b))
        );

        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = suffixes[i];
        }

        return result;
    }

    public static void main(String[] args) {

        String text = "banana";

        int[] suffixArray = buildSuffixArray(text);

        System.out.println("Text: " + text);
        System.out.println("Suffix Array: "
                + Arrays.toString(suffixArray));
    }
}