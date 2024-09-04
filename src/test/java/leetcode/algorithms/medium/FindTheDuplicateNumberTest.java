package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class FindTheDuplicateNumberTest {

    @Test
    public void test1() {
        int[] nums = {1,3,4,2,2};
        int output = 2;
        Assert.assertEquals(FindTheDuplicateNumber.findDuplicate(nums), output);
    }

    @Test
    public void test2() {
        int[] nums = {3,1,3,4,2};
        int output = 3;
        Assert.assertEquals(FindTheDuplicateNumber.findDuplicate(nums), output);
    }

    @Test
    public void test3() {
        int[] nums = {3,3,3,3,3};
        int output = 3;
        Assert.assertEquals(FindTheDuplicateNumber.findDuplicate(nums), output);
    }
}
