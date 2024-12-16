package leetcode.algorithms.easy;

import java.util.PriorityQueue;

// 3264. Final Array State After K Multiplication Operations I
public class FinalArrayStateAfterKMultiplicationOperationsI {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> {
            int valueComparison = Integer.compare(a[0], b[0]);
            if (valueComparison == 0) {
                return Integer.compare(a[1], b[1]);
            }
            return valueComparison;
        });
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(new int[] {nums[i], i});
        }

        while (k-- > 0) {
            int[] pair = minHeap.poll();
            int n = pair[0] * multiplier;
            int i = pair[1];
            minHeap.offer(new int[] {n, i});
        }

        int[] output = new int[nums.length];
        while (!minHeap.isEmpty()) {
            int[] pair = minHeap.poll();
            int n = pair[0];
            int i = pair[1];
            output[i] = n;
        }
        return output;
    }
}
