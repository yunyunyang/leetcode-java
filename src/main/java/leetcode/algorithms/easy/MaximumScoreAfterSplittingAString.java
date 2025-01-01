package leetcode.algorithms.easy;

// 1422. Maximum Score After Splitting a String
public class MaximumScoreAfterSplittingAString {

    public int maxScore(String s) {
        int zero = 0;
        int one = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') one ++;
        }

        int maxScore = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zero ++;
            } else {
                one --;
            }
            maxScore = Math.max(maxScore, zero + one);
        }
        return maxScore;
    }
}
