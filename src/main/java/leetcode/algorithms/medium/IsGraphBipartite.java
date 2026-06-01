package leetcode.algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;

// 785. Is Graph Bipartite?
public class IsGraphBipartite {

    private boolean ok = true;
    private boolean[] color;
    private boolean[] visited;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        color = new boolean[n];
        visited = new boolean[n];
        for (int v = 0; v < n; v++) {
            if (!visited[v]) {
                traverse(graph, v);
            }
        }
        return ok;
    }

    void traverse(int[][] graph, int v) {
        if (!ok) return;

        visited[v] = true;
        for (int w : graph[v]) {
            if (!visited[w]) {
                color[w] = !color[v];
                traverse(graph, w);
            } else {
                if (color[v] == color[w]) {
                    ok = false;
                }
            }
        }
    }

    void bfs(int[][] graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.offer(start);

        while (!q.isEmpty() && ok) {
            int v = q.poll();
            for (int w : graph[v]) {
                if (!visited[w]) {
                    color[w] = !color[v];
                    visited[w] = true;
                    q.offer(w);
                } else {
                    if (color[v] == color[w]) {
                        ok = false;
                    }
                }
            }
        }
    }
}
