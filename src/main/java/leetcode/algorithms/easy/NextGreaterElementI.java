package leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 496. Next Greater Element I
public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.pop(), n);
            }
            stack.add(n);
        }

        int[] output = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            output[i] = map.getOrDefault(nums1[i], -1);
        }
        return output;
    }
}
