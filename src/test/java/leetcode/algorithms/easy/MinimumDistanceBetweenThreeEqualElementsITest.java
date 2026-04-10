package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MinimumDistanceBetweenThreeEqualElementsITest {

    @Test
    public void example1() {
        int[] nums = {1, 2, 1, 1, 3};
        int expected = 6;
        Assert.assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums));
    }

    @Test
    public void example2() {
        int[] nums = {1, 1, 2, 3, 2, 1, 2};
        int expected = 8;
        Assert.assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums));
    }

    @Test
    public void example3() {
        int[] nums = {1};
        int expected = -1;
        Assert.assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums));
    }

    @Test
    public void example4() {
        int[] nums = {1, 1, 2};
        int expected = -1;
        Assert.assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums));
    }

    @Test
    public void example5() {
        int[] nums = {1, 1, 1, 1};
        int expected = 4;
        Assert.assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums));
    }

    @Test
    public void example6() {
        int[] nums = {5, 3, 5, 5, 5};
        int expected = 4;
        Assert.assertEquals(expected, MinimumDistanceBetweenThreeEqualElementsI.minimumDistance(nums));
    }

}
