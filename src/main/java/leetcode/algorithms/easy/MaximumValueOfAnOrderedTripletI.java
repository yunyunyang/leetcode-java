package leetcode.algorithms.easy;

// 2873. Maximum Value of an Ordered Triplet I
public class MaximumValueOfAnOrderedTripletI {

    public long maximumTripletValue(int[] nums) {
        long res = 0;
        for (int i1 = 0; i1 < nums.length - 2; i1++) {
            for (int i2 = i1 + 1; i2 < nums.length - 1; i2++) {
                for (int i3 = i2 + 1; i3 < nums.length; i3++) {
                    res = Math.max(res, (long)(nums[i1] - nums[i2]) * nums[i3]);
                    System.out.println(res);
                }
            }
        }
        return Math.max(res, 0);
    }
}
