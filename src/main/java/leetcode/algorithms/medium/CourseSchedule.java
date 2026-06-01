package leetcode.algorithms.medium;

import java.util.LinkedList;
import java.util.List;

// 207. Course Schedule
public class CourseSchedule {

    boolean[] path;
    boolean[] visited;
    boolean hasCycle = false;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        path = new boolean[numCourses];
        visited = new boolean[numCourses];
        List<Integer>[] graph = buildGraph(numCourses, prerequisites);
        for (int i = 0; i < numCourses; i++) {
            dfs(graph, i);
        }
        return !hasCycle;
    }

    List<Integer>[] buildGraph(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int[] edge : prerequisites) {
            int to = edge[0], from = edge[1];
            graph[from].add(to);
        }
        return graph;
    }

    void dfs(List<Integer>[] graph, int s) {
        if (hasCycle) return;

        if (path[s]) {
            hasCycle = true;
            return;
        }

        if (visited[s])
            return;

        visited[s] = true;
        path[s] = true;
        for (int t : graph[s]) {
            dfs(graph, t);
        }
        path[s] = false;
    }

    void bfs(List<Integer>[] graph, int s) {

    }
}
