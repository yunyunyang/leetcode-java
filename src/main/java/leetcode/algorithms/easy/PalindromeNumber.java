package leetcode.algorithms.easy;

// 9. Palindrome Number
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        int temp = x;
        int y = 0;
        while (temp > 0) {
            int last = temp % 10;
            temp /= 10;
            y = y * 10 + last;
        }
        return x == y;
    }
}
