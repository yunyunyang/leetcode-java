package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

// 2807. Insert Greatest Common Divisors in Linked List
public class InsertGreatestCommonDivisorsInLinkedList {

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = head;
        while (dummy != null) {
            ListNode node = dummy.next;
            if (node != null) {
                int m = Math.max(dummy.val, node.val);
                int n = Math.min(dummy.val, node.val);
                int gcd = gcd(m, n);
                dummy.next = new ListNode(gcd, node);
            }
            dummy = node;
        }
        return head;
    }

    private int gcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return gcd(n, m % n);
        }
    }
}
