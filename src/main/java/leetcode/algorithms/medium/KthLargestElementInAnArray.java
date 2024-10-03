package leetcode.algorithms.medium;

import java.util.PriorityQueue;

// 215. Kth Largest Element in an Array
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) {
            if (pq.size() == k) {
                if (n > pq.peek()) {
                    pq.poll();
                    pq.offer(n);
                }
            } else {
                pq.offer(n);
            }
        }
        return pq.peek();
    }
}
