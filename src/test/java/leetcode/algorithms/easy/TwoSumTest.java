package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void exampleOne() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] output = {0,1};
        Assert.assertArrayEquals(TwoSum.twoSum(nums, target), output);
    }

    @Test
    public void exampleTwo() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] output = {1,2};
        Assert.assertArrayEquals(TwoSum.twoSum(nums, target), output);
    }

    @Test
    public void exampleThree() {
        int[] nums = {3,3};
        int target = 6;
        int[] output = {0,1};
        Assert.assertArrayEquals(TwoSum.twoSum(nums, target), output);
    }
}
