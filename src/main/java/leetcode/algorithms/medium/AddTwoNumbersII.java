package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

import java.util.Stack;

// 445. Add Two Numbers II
public class AddTwoNumbersII {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stk1 = new Stack<>();
        while (l1 != null) {
            stk1.push(l1.val);
            l1 = l1.next;
        }

        Stack<Integer> stk2 = new Stack<>();
        while (l2 != null) {
            stk2.push(l2.val);
            l2 = l2.next;
        }

        ListNode dummy = new ListNode();
        ListNode node = dummy;

        int carry = 0;
        while (!stk1.isEmpty()|| !stk2.isEmpty() || carry > 0) {
            int val = carry;
            if (!stk1.isEmpty()) {
                val += stk1.pop();
            }
            if (!stk2.isEmpty()) {
                val += stk2.pop();
            }

            carry = val / 10;
            val = val % 10;

            ListNode newNode = new ListNode(val);
            newNode.next = dummy.next;
            dummy.next = newNode;
        }
        return dummy.next;
    }
}
