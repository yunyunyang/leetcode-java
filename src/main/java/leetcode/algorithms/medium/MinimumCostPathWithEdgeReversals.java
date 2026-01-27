package leetcode.algorithms.medium;

import java.util.*;

// 3650. Minimum Cost Path with Edge Reversals
public class MinimumCostPathWithEdgeReversals {

    public int minCost(int n, int[][] edges) {
        List<int[]>[] paths = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            paths[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            paths[u].add(new int[] {v, w});
            paths[v].add(new int[] {u, 2 * w});
        }

        // Dijkstra
        int[] d = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(d, Integer.MAX_VALUE);
        d[0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
                Comparator.comparingInt(e -> e[0])
        );
        pq.offer(new int[] {0, 0});

        while(!pq.isEmpty()) {
            int[] current = pq.poll();
            int dist = current[0];
            int x = current[1];

            if (x == n - 1)
                return dist;

            if (visited[x])
                continue;

            visited[x] = true;

            for (int[] neighbor : paths[x]) {
                int y = neighbor[0];
                int w = neighbor[1];

                if (dist + w < d[y]) {
                    d[y] = dist + w;
                    pq.offer(new int[] {d[y], y});
                }
            }
        }
        return -1;
    }
}
