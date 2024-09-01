package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class Convert1DArrayInto2DArrayTest {

    @Test
    public void example1() {
        int[] original = {1,2,3,4};
        int m = 2;
        int n = 2;
        int[][] output = {{1,2},{3,4}};
        Assert.assertArrayEquals(Convert1DArrayInto2DArray.construct2DArray(original, m, n), output);
    }

    @Test
    public void example2() {
        int[] original = {1,2,3};
        int m = 1;
        int n = 3;
        int[][] output = {{1,2,3}};
        Assert.assertArrayEquals(Convert1DArrayInto2DArray.construct2DArray(original, m, n), output);
    }

    @Test
    public void example3() {
        int[] original = {1,2};
        int m = 1;
        int n = 1;
        int[][] output = {};
        Assert.assertArrayEquals(Convert1DArrayInto2DArray.construct2DArray(original, m, n), output);
    }
}
