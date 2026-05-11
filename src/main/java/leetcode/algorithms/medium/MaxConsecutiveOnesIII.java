package leetcode.algorithms.medium;

// 1004. Max Consecutive Ones III
public class MaxConsecutiveOnesIII {

    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int windowOneCount = 0;

        int res = 0;
        while (right < nums.length) {
            if (nums[right] == 1) {
                windowOneCount++;
            }
            right++;

            while (right - left - windowOneCount > k) {
                if (nums[left] == 1) {
                    windowOneCount--;
                }
                left++;
            }

            res = Math.max(res, right - left);
        }
        return res;
    }
}
