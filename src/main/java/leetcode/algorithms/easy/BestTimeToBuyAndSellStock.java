package leetcode.algorithms.easy;

// 121. Best Time to Buy and Sell Stock
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            }
            maxProfit = Math.max(maxProfit, price - lowestPrice);
        }
        return maxProfit;
    }
}
