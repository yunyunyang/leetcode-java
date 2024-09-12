package leetcode.algorithms.medium;

public class Pow_x_n {

    public double myPow(double x, int n) {
        double output = helper(x, Math.abs(n));
        if (n >= 0) {
            return output;
        } else {
            return 1 / output;
        }
    }

    private double helper(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        double res = helper(x, n / 2);
        res = res * res;
        if (n % 2 == 0) {
            return res;
        } else {
            return x * res;
        }
    }
}
