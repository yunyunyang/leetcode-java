package leetcode.algorithms.easy;

import java.util.PriorityQueue;

// 703. Kth Largest Element in a Stream
public class KthLargestElementInAStream {

    private int k;
    private PriorityQueue<Integer> minHeap;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        this.minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
        }
        while (minHeap.size() > k) {
            minHeap.poll();
        }
    }

    public int add(int val) {
        this.minHeap.offer(val);
        while (minHeap.size() > k) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
}
