package leetcode.algorithms.hard;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

// 407. Trapping Rain Water II
public class TrappingRainWaterII {

    public int trapRainWater(int[][] heightMap) {
        int rows = heightMap.length;
        int cols = heightMap[0].length;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        Set<String> visit = new HashSet<>();

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 || r == rows - 1 || c == 0 || c == cols - 1) {
                    queue.offer(new int[] {heightMap[r][c], r, c});
                    visit.add(r + "," + c);
                }
            }
        }

        int res = 0;
        int maxHeight = 0;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int h = curr[0];
            int r = curr[1];
            int c = curr[2];
            maxHeight = Math.max(maxHeight, h);
            res += maxHeight - h;

            int[][] dirs = new int[][] {{r + 1, c}, {r - 1, c}, {r, c + 1}, {r, c - 1}};
            for (int[] dir : dirs) {
                int nr = dir[0];
                int nc = dir[1];
                String key = nr + "," + nc;
                if (nc < 0 || nr < 0 || nr == rows || nc == cols || visit.contains(key)) {
                    continue;
                }
                queue.offer(new int[] {heightMap[nr][nc], nr, nc});
                visit.add(nr + "," + nc);
            }
        }
        return res;
    }
}
