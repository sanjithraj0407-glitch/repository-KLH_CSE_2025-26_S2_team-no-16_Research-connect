
package algorithms;

import java.util.*;

public class VertexCoverTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("   VERTEX COVER APPROXIMATION");
        System.out.println("====================================");

        System.out.print("Enter number of vertices: ");
        int vertices = scanner.nextInt();

        System.out.print("Enter number of edges: ");
        int edgeCount = scanner.nextInt();

        int[][] edges = new int[edgeCount][2];

        System.out.println("Enter each edge as two vertex numbers.");
        System.out.println("Vertices must be numbered from 0 to "
                + (vertices - 1) + ".");

        for (int i = 0; i < edgeCount; i++) {
            System.out.print("Edge " + (i + 1) + ": ");
            edges[i][0] = scanner.nextInt();
            edges[i][1] = scanner.nextInt();

            if (edges[i][0] < 0 || edges[i][0] >= vertices
                    || edges[i][1] < 0 || edges[i][1] >= vertices
                    || edges[i][0] == edges[i][1]) {
                System.out.println("Invalid edge. Run the program again.");
                scanner.close();
                return;
            }
        }

        List<Integer> cover =
                VertexCover.findApproximateCover(vertices, edges);

        System.out.println();
        System.out.println("Selected vertices: " + cover);
        System.out.println("Cover size: " + cover.size());

        if (VertexCover.coversAllEdges(cover, edges)) {
            System.out.println("Test PASSED: All edges are covered.");
        } else {
            System.out.println("Test FAILED: Some edges are uncovered.");
        }

        scanner.close();
    }
}
