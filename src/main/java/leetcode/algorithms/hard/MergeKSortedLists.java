package leetcode.algorithms.hard;

import leetcode.algorithms.ListNode;

import java.util.PriorityQueue;

// 23. Merge k Sorted Lists
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode list : lists) {
            if (list != null) {
                heap.offer(list);
            }
        }

        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            cur.next = node;
            cur = cur.next;

            if (node.next != null) {
                heap.offer(node.next);
            }
        }
        return dummy.next;
    }
}
