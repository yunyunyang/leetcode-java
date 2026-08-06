package leetcode.algorithms.easy;

// 3345. Smallest Divisible Digit Product I
public class SmallestDivisibleDigitProductI {

    public int smallestNumber(int n, int t) {
        int product = 1;
        while (n <= 100) {
            int num = n;
            while (num > 0) {
                product *= (num % 10);
                num /= 10;
            }

            if (product % t == 0)
                return n;

            product = 1;
            n++;
        }
        return -1;
    }
}
