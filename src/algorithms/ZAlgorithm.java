package algorithms;

import java.util.Arrays;

public class ZAlgorithm {

    public static int[] buildZArray(String text) {

        int n = text.length();
        int[] z = new int[n];

        int left = 0;
        int right = 0;

        for (int i = 1; i < n; i++) {

            if (i <= right) {
                z[i] = Math.min(right - i + 1,
                        z[i - left]);
            }

            while (i + z[i] < n &&
                    text.charAt(z[i]) ==
                    text.charAt(i + z[i])) {

                z[i]++;
            }

            if (i + z[i] - 1 > right) {
                left = i;
                right = i + z[i] - 1;
            }
        }

        return z;
    }

    public static void main(String[] args) {

        String text = "aabcaab";

        int[] z = buildZArray(text);

        System.out.println("Text: " + text);
        System.out.println("Z Array: "
                + Arrays.toString(z));
    }
}