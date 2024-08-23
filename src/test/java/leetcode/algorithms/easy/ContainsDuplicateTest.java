package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateTest {

    @Test
    public void exampleOne() {
        int[] nums = {1,2,3,1};
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void exampleTwo() {
        int[] nums = {1,2,3,4};
        Assert.assertFalse(ContainsDuplicate.containsDuplicate(nums));
    }

    @Test
    public void exampleThree() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        Assert.assertTrue(ContainsDuplicate.containsDuplicate(nums));
    }
}
