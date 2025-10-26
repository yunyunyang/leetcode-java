package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

// 82. Remove Duplicates from Sorted List II
public class RemoveDuplicatesFromSortedListII {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyUniq = new ListNode(101);
        ListNode dummyDup = new ListNode(101);

        ListNode nodeUniq = dummyUniq, nodeDup = dummyDup;
        ListNode node = head;

        while (node != null) {
            if ((node.next != null && node.val == node.next.val) || node.val == nodeDup.val) {
                nodeDup.next = node;
                nodeDup = nodeDup.next;
            } else {
                nodeUniq.next = node;
                nodeUniq = nodeUniq.next;
            }
            node = node.next;

            nodeDup.next = null;
            nodeUniq.next = null;
        }
        return dummyUniq.next;
    }
}
