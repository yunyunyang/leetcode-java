package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

// 61. Rotate List
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return head;

        ListNode dummy = head;
        int size = 1;
        while (dummy.next != null) {
            dummy = dummy.next;
            size++;
        }

        int rotation = k % size;
        if (rotation == 0)  return head;

        ListNode cur = head;
        for (int i = 0; i < size - rotation - 1; i++) {
            cur = cur.next;
        }

        ListNode newHead = cur.next;
        cur.next = null;
        dummy.next = head;

        return newHead;
    }
}
