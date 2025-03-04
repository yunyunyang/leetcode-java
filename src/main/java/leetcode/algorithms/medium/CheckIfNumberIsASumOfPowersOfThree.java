package leetcode.algorithms.medium;

// 1780. Check if Number is a Sum of Powers of Three
public class CheckIfNumberIsASumOfPowersOfThree {

    public boolean checkPowersOfThree(int n) {
        return backtrack(0, 0, n);
    }

    private boolean backtrack(int i, double sum, int n) {
        if (sum == n) return true;
        if (sum > n || Math.pow(3, i) > n) return false;
        if (backtrack(i + 1, sum + Math.pow(3, i), n)) return true;
        if (backtrack(i + 1, sum, n)) return true;

        return false;
    }
}
