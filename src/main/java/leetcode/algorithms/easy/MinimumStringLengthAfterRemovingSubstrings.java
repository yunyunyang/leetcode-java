package leetcode.algorithms.easy;

import java.util.Stack;

// 2696. Minimum String Length After Removing Substrings
public class MinimumStringLengthAfterRemovingSubstrings {

    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c == 'B' && !stack.isEmpty() && stack.peek() == 'A') || (c == 'D' && !stack.isEmpty() && stack.peek() == 'C')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
