package leetcode.algorithms.easy;

import leetcode.algorithms.ListNode;

// 160. Intersection of Two Linked Lists
public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode n1 = headA, n2 = headB;
        while (n1 != n2) {
            if (n1 == null) {
                n1 = headB;
            } else {
                n1 = n1.next;
            }

            if (n2 == null) {
                n2 = headA;
            } else {
                n2 = n2.next;
            }
        }
        return n1;
    }
}
