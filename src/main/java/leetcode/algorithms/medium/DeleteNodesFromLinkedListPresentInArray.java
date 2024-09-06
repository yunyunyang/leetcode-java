package leetcode.algorithms.medium;

import leetcode.algorithms.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 3217. Delete Nodes From Linked List Present in Array
public class DeleteNodesFromLinkedListPresentInArray {

    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (head != null) {
            if (!set.contains(head.val)) {
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        curr.next = null;
        return dummy.next;
    }
}
