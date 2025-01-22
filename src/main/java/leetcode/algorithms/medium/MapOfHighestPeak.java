package leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

// 1765. Map of Highest Peak
public class MapOfHighestPeak {

    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int cols = isWater[0].length;

        Queue<int[]> q = new LinkedList<>();
        Set<String> visit = new HashSet<>();
        int[][] res = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (isWater[r][c] == 1) {
                    q.offer(new int[] {r, c});
                    visit.add(r + "," + c);
                }
            }
        }

        int height = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] coor = q.poll();
                int r = coor[0], c = coor[1];
                int[][] directions = new int[][] {{r + 1, c}, {r - 1, c}, {r, c + 1}, {r, c - 1}};
                for (int[] dir : directions) {
                    int nr = dir[0], nc = dir[1];
                    String key = nr + "," + nc;
                    if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || visit.contains(key)) {
                        continue;
                    }
                    res[nr][nc] = height;
                    visit.add(key);
                    q.offer(new int[] {nr, nc});
                }
            }
            height ++;
        }
        return res;
    }
}
