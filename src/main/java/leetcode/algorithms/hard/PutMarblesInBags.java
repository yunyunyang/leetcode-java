package leetcode.algorithms.hard;

import java.util.PriorityQueue;

// 2551. Put Marbles in Bags
public class PutMarblesInBags {

    public long putMarbles(int[] weights, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < weights.length - 1; i++) {
            int val = weights[i] + weights[i + 1];
            minHeap.offer(val);
            maxHeap.offer(val);
        }

        long min = 0, max = 0;
        for (int i = 0; i < k - 1; i++) {
            min += minHeap.poll();
            max += maxHeap.poll();
        }
        return max - min;
    }
}
