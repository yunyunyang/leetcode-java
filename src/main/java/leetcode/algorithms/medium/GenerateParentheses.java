package leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

// 22. Generate Parentheses
public class GenerateParentheses {

    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        StringBuilder sb = new StringBuilder();
        backtrack(n, n, sb);
        return res;
    }

    void backtrack(int left, int right, StringBuilder sb) {
        if (left > right) return;
        if (left < 0 || right < 0) return;
        if (left == 0 && right == 0) {
            res.add(sb.toString());
            return;
        }

        sb.append('(');
        backtrack(left - 1, right, sb);
        sb.deleteCharAt(sb.length() - 1);

        sb.append(')');
        backtrack(left, right - 1, sb);
        sb.deleteCharAt(sb.length() - 1);
    }
}
