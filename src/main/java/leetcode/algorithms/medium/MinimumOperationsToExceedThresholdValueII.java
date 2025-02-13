package leetcode.algorithms.medium;

import java.util.PriorityQueue;

// 3066. Minimum Operations to Exceed Threshold Value II
public class MinimumOperationsToExceedThresholdValueII {

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        for (int n : nums) {
            heap.offer(Long.valueOf(n));
        }

        int ops = 0;
        while (!heap.isEmpty() && heap.size() >= 2 && heap.peek() < k) {
            long x = heap.poll();
            long y = heap.poll();
            long r = Math.min(x, y) * 2 + Math.max(x, y);
            heap.offer(r);
            ops ++;
        }
        return ops;
    }
}
