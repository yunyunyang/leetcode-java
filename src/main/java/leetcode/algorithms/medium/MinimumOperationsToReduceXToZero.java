package leetcode.algorithms.medium;

// 1658. Minimum Operations to Reduce X to Zero
public class MinimumOperationsToReduceXToZero {

    public int minOperations(int[] nums, int x) {
        int n = nums.length, sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        int target = sum - x;
        int windowSum = 0;
        int left = 0, right = 0;
        int maxLen = Integer.MIN_VALUE;
        while (right < n) {
            windowSum += nums[right];
            right++;

            while (windowSum > target && left < right) {
                windowSum -= nums[left];
                left++;
            }

            if (windowSum == target) {
                maxLen = Math.max(maxLen, right - left);
            }
        }
        return (maxLen == Integer.MIN_VALUE) ? -1 : n - maxLen;
    }
}
