package leetcode.algorithms.easy;

import java.util.Arrays;

// 1984. Minimum Difference Between Highest and Lowest of K Scores
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            minDiff = Math.min(minDiff, nums[i + k - 1] - nums[i]);
        }
        return minDiff;
    }
}
