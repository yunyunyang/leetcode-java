package leetcode.algorithms.easy;

import leetcode.algorithms.ListNode;

// 234. Palindrome Linked List
public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedNode = reverse(slow);
        ListNode node = head;
        while (reversedNode != null) {
            if (node.val != reversedNode.val) {
                return false;
            }
            node = node.next;
            reversedNode = reversedNode.next;
        }
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null, curr = node, next = node.next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;
            if (next != null) {
                next = next.next;
            }
        }
        return prev;
    }
}
