package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

// 92. Reverse Linked List II
public class ReverseLinkedListII {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) {
            return reverse(head, right);
        }

        ListNode p = head;
        for (int i = 1; i < left - 1; i++) {
            p = p.next;
        }

        p.next = reverse(p.next, right - left + 1);
        return head;
    }

    ListNode reverse(ListNode node, int n) {
        if (node == null || node.next == null)
            return node;

        ListNode prev = null, curr = node, next = node.next;
        while (n > 0) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next.next != null)
                next = next.next;

            n--;
        }
        node.next = curr;
        return prev;
    }
}
