package leetcode.algorithms.medium;

// 921. Minimum Add to Make Parentheses Valid
public class MinimumAddToMakeParenthesesValid {

    public int minAddToMakeValid(String s) {
        int res = 0, need = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                res++;
            }

            if (s.charAt(i) == ')') {
                res--;
                if (res == -1) {
                    res = 0;
                    need++;
                }
            }
        }
        return res + need;
    }
}
