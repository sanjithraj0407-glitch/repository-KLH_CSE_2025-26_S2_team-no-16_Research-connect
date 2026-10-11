
package algorithms;

import java.util.*;

public class EdmondsKarp {

    public static int maxFlow(int[][] capacity, int source, int sink) {
        int n = capacity.length;
        int[][] residual = new int[n][n];

        for (int i = 0; i < n; i++) {
            residual[i] = capacity[i].clone();
        }

        int maxFlow = 0;
        int[] parent = new int[n];

        while (bfs(residual, source, sink, parent)) {
            int pathFlow = Integer.MAX_VALUE;

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, residual[u][v]);
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                residual[u][v] -= pathFlow;
                residual[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    private static boolean bfs(
            int[][] residual, int source, int sink, int[] parent) {

        Arrays.fill(parent, -1);
        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        parent[source] = source;

        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v = 0; v < residual.length; v++) {
                if (parent[v] == -1 && residual[u][v] > 0) {
                    parent[v] = u;

                    if (v == sink) {
                        return true;
                    }

                    queue.add(v);
                }
            }
        }

        return false;
    }
}
