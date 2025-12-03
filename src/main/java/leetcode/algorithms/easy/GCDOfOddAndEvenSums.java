package leetcode.algorithms.easy;

// 3658. GCD of Odd and Even Sums
public class GCDOfOddAndEvenSums {

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= n * 2; i++) {
            if (i % 2 == 1) {
                sumOdd += i;
            } else {
                sumEven += i;
            }
        }
        return gcd(sumOdd, sumEven);
    }

    private int gcd(int odd, int even) {
        if (even == 0) {
            return odd;
        }
        return gcd(even, odd % even);
    }
}
