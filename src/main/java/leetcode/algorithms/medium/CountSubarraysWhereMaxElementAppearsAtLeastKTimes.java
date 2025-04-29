package leetcode.algorithms.medium;

import java.util.Arrays;

// 2962. Count Subarrays Where Max Element Appears at Least K Times
public class CountSubarraysWhereMaxElementAppearsAtLeastKTimes {

    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int left = 0;
        int count = 0;
        long result = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == max) {
                count++;
            }

            while (count >= k) {
                result += nums.length - right;
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }
        }
        return result;
    }

}
