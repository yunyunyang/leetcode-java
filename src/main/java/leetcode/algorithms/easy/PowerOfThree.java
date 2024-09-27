package leetcode.algorithms.easy;

// 326. Power of Three
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 3 == 0) {
            n /= 3;
            return isPowerOfThree(n);
        } else {
            return false;
        }
    }
}
