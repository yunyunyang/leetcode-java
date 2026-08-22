package leetcode.algorithms.easy;

// 3622. Check Divisibility by Digit Sum and Product
public class CheckDivisibilityByDigitSumAndProduct {

    public boolean checkDivisibility(int n) {
        return n % (calculation(n, '+') + calculation(n, '*')) == 0;
    }

    private int calculation(int n, char operator) {
        int sum = 0, product = 1;
        while (n > 0) {
            int digit = n % 10;
            if (operator == '+') {
                sum += digit;
            } else if (operator == '*') {
                product *= digit;
            }
            n /= 10;
        }
        return (operator == '+') ? sum : product;
    }
}
