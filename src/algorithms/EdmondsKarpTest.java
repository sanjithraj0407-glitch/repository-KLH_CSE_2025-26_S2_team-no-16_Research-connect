
package algorithms;

import java.util.Scanner;

public class EdmondsKarpTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("      EDMONDS-KARP ALGORITHM");
        System.out.println("====================================");

        System.out.println("Nodes: 0, 1, 2, 3, 4, 5");
        System.out.println("Source: 0 | Sink: 5");

        int[][] capacity = {
            {0, 16, 13, 0, 0, 0},
            {0, 0, 10, 12, 0, 0},
            {0, 4, 0, 0, 14, 0},
            {0, 0, 9, 0, 0, 20},
            {0, 0, 0, 7, 0, 4},
            {0, 0, 0, 0, 0, 0}
        };

        System.out.print("Press Enter to calculate maximum flow...");
        scanner.nextLine();

        int result = EdmondsKarp.maxFlow(capacity, 0, 5);

        System.out.println();
        System.out.println("Source node      : 0");
        System.out.println("Destination node : 5");
        System.out.println("Maximum flow     : " + result);
        System.out.println("Test completed successfully.");

        scanner.close();
    }
}
