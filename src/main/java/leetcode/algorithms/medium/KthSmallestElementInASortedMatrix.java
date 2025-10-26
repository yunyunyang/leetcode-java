package leetcode.algorithms.medium;

import java.util.PriorityQueue;

// 378. Kth Smallest Element in a Sorted Matrix
public class KthSmallestElementInASortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < matrix.length; i++) {
            pq.offer(new int[]{matrix[i][0], i, 0});
        }

        int result = -1;
        while (!pq.isEmpty() && k > 0) {
            int[] cur = pq.poll();
            result = cur[0];
            k--;

            int row = cur[1], col = cur[2];
            if (col + 1 < matrix[0].length) {
                pq.offer(new int[]{matrix[row][col + 1], row, col + 1});
            }
        }
        return result;
    }
}
