package leetcode.algorithms.medium;

// 2825. Make String a Subsequence Using Cyclic Increments
public class MakeStringASubsequenceUsingCyclicIncrements {

    public boolean canMakeSubsequence(String str1, String str2) {
        int j = 0;
        for (int i = 0; i < str1.length();i ++) {
            int s1 = str1.charAt(i) - 'a';
            int s2 = str2.charAt(j) - 'a';
            if (s1 == s2 || (s1 + 1) % 26 == s2) {
                j++;
            }
            if (j == str2.length()) {
                return true;
            }
        }
        return false;
    }
}
