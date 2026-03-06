package leetcode.algorithms.easy;

// 1979. Find Greatest Common Divisor of Array
public class FindGreatestCommonDivisorOfArray {

    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return gcd(max, min);
    }

    private int gcd(int max, int min) {
        if (min == 0) return max;
        return gcd(min, max % min);
    }
}
