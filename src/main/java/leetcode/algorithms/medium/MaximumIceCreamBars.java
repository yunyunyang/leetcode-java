package leetcode.algorithms.medium;

import java.util.Arrays;

// 1833. Maximum Ice Cream Bars
public class MaximumIceCreamBars {

    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        for (int i = 0; i < costs.length; i++) {
            if (coins <= 0)
                break;

            if (coins - costs[i] >= 0) {
                coins -= costs[i];
                res++;
            }
        }
        return res;
    }
}
