package leetcode.algorithms.medium;

// 2874. Maximum Value of an Ordered Triplet II
public class MaximumValueOfAnOrderedTripletII {

    public long maximumTripletValue(int[] nums) {
        int prefixMax = nums[0];
        int maxDiff = 0;
        long res = 0;
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res, (long) maxDiff * nums[i]);
            prefixMax = Math.max(prefixMax, nums[i]);
            maxDiff = Math.max(maxDiff, prefixMax - nums[i]);
        }
        return res;
    }
}
