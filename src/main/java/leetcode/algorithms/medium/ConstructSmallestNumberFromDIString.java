package leetcode.algorithms.medium;

import java.util.Stack;

// 2375. Construct Smallest Number From DI String
public class ConstructSmallestNumberFromDIString {

    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < pattern.length() + 1; i++) {
            stack.push(i + 1);
            while (!stack.isEmpty() && (i == pattern.length() || pattern.charAt(i) == 'I')) {
                sb.append(stack.pop());
            }
        }

        return sb.toString();
    }
}
