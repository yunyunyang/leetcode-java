package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

// 86. Partition List
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode();
        ListNode dummy2 = new ListNode();
        ListNode node1 = dummy1, node2 = dummy2;
        ListNode node = head;

        while (node != null) {
            if (node.val < x) {
                node1.next = node;
                node1 = node1.next;
            } else {
                node2.next = node;
                node2 = node2.next;
            }
            ListNode temp = node.next;
            node.next = null;
            node = temp;
        }

        node1.next = dummy2.next;
        return dummy1.next;
    }
}
