package leetcode.algorithms.medium;

import java.util.Arrays;
import java.util.PriorityQueue;

// 870. Advantage Shuffle
public class AdvantageShuffle {

    public int[] advantageCount(int[] nums1, int[] nums2) {
        int n = nums1.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
                (a, b) -> b[1] - a[1]
        );
        for (int i = 0; i < n; i++) {
            pq.offer(new int[]{i, nums2[i]});
        }

        Arrays.sort(nums1);

        int[] res = new int[n];
        int left = 0, right = n - 1;

        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int i = pair[0], maxVal = pair[1];
            if (nums1[right] > maxVal) {
                res[i] = nums1[right];
                right--;
            } else {
                res[i] = nums1[left];
                left++;
            }
        }
        return res;
    }
}
