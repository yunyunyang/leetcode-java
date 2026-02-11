package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 797. All Paths From Source to Target
public class AllPathsFromSourceToTarget {
    List<List<Integer>> res = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        traverse(graph, 0);
        return res;
    }

    void traverse(int[][] graph, int s) {
        path.add(s);

        if (s == graph.length - 1) {
            res.add(new ArrayList<>(path));
            path.remove(path.size() - 1);
            return;
        }

        for (int v : graph[s]) {
            traverse(graph, v);
        }

        path.remove(path.size() - 1);
    }
}
