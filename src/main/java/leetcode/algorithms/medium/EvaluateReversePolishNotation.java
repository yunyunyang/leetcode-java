package leetcode.algorithms.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// 150. Evaluate Reverse Polish Notation
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        Set<String> ops = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        for (String s : tokens) {
            if (ops.contains(s)) {
                int b = stack.pop();
                int a = stack.pop();
                if ("+".equals(s)) {
                    stack.add(a + b);
                } else if ("-".equals(s)) {
                    stack.add(a - b);
                } else if ("*".equals(s)) {
                    stack.add(a * b);
                } else if ("/".equals(s)) {
                    stack.add(a / b);
                }
            } else {
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.get(0);
    }
}
