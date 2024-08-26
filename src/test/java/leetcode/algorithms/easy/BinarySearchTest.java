package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void example1() {
        int[] nums = {-1,0,3,5,9,12};
        Assert.assertEquals(BinarySearch.search(nums, 9), 4);
    }

    @Test
    public void example2() {
        int[] nums = {-1,0,3,5,9,12};
        Assert.assertEquals(BinarySearch.search(nums, 2), -1);
    }
}
