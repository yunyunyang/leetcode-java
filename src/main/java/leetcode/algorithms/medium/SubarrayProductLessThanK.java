package leetcode.algorithms.medium;

// 713. Subarray Product Less Than K
public class SubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0;
        int windowProduct = 1;

        int count = 0;
        while (right < nums.length) {
            windowProduct = windowProduct * nums[right];
            right++;

            while (windowProduct >= k && left < right) {
                windowProduct = windowProduct / nums[left];
                left++;
            }
            count += right - left;
        }
        return count;
    }
}
