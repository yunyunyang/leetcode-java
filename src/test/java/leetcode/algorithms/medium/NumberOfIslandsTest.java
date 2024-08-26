package leetcode.algorithms.medium;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {

    @Test
    public void example1() {
        char[][] grid = {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}};
        Assert.assertEquals(NumberOfIslands.numIslands(grid), 1);
    }

    @Test
    public void example2() {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        Assert.assertEquals(NumberOfIslands.numIslands(grid), 3);
    }
}
