package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class MaximumSubarrayTest {

    @Test
    public void test1() {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int output = 6;
        Assert.assertEquals(MaximumSubarray.maxSubArray(nums), output);
    }

    @Test
    public void test2() {
        int[] nums = {1};
        int output = 1;
        Assert.assertEquals(MaximumSubarray.maxSubArray(nums), output);
    }

    @Test
    public void test3() {
        int[] nums = {5,4,-1,7,8};
        int output = 23;
        Assert.assertEquals(MaximumSubarray.maxSubArray(nums), output);
    }
}
