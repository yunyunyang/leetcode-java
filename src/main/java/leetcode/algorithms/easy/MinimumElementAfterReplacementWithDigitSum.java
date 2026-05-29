package leetcode.algorithms.easy;

// 3300. Minimum Element After Replacement With Digit Sum
public class MinimumElementAfterReplacementWithDigitSum {

    public int minElement(int[] nums) {
        int res = Integer.MAX_VALUE;
        for (int num : nums) {
            res = Math.min(res, getDigitsSum(num));
        }
        return res;
    }

    int getDigitsSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
        return sum;
    }
}
