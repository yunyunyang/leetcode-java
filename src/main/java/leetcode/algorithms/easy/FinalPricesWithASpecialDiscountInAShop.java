package leetcode.algorithms.easy;

import java.util.Stack;

// 1475. Final Prices With a Special Discount in a Shop
public class FinalPricesWithASpecialDiscountInAShop {

    public int[] finalPrices(int[] prices) {
        int[] output = prices.clone();

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int j = stack.pop();
                output[j] -= prices[i];
            }
            stack.add(i);
        }
        return output;
    }
}
