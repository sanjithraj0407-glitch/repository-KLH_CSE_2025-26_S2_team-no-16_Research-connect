
package algorithms;

import java.util.*;

public class VertexCover {

    public static List<Integer> findApproximateCover(
            int vertices, int[][] edges) {

        boolean[] covered = new boolean[vertices];
        List<Integer> cover = new ArrayList<>();

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (!covered[u] && !covered[v]) {
                cover.add(u);
                cover.add(v);

                covered[u] = true;
                covered[v] = true;
            }
        }

        return cover;
    }

    public static boolean coversAllEdges(
            List<Integer> cover, int[][] edges) {

        Set<Integer> selected = new HashSet<>(cover);

        for (int[] edge : edges) {
            if (!selected.contains(edge[0])
                    && !selected.contains(edge[1])) {
                return false;
            }
        }

        return true;
    }
}
