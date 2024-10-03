package leetcode.algorithms.medium;

import java.util.Stack;

// 71. Simplify Path
public class SimplifyPath {

    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] strs = path.split("/");

        for (String str : strs) {
            if ("".equals(str) || ".".equals(str)) {
                continue;
            } else if ("..".equals(str)) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(str);
            }
        }
        return "/" + String.join("/", stack);
    }
}
