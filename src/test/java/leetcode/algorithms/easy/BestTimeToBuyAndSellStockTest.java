package leetcode.algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};
        int output = 5;
        Assert.assertEquals(BestTimeToBuyAndSellStock.maxProfit(prices), output);
    }

    @Test
    public void test2() {
        int[] prices = {7,6,4,3,1};
        int output = 0;
        Assert.assertEquals(BestTimeToBuyAndSellStock.maxProfit(prices), output);
    }
}
