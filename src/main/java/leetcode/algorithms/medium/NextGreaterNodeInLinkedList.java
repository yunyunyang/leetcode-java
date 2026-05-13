package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 1019. Next Greater Node In Linked List
public class NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode p = head;
        while (p != null) {
            list.add(p.val);
            p = p.next;
        }

        int[] res = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= list.get(i)) {
                stack.pop();
            }
            res[i] = stack.isEmpty() ? 0 : stack.peek();
            stack.push(list.get(i));
        }
        return res;
    }
}
