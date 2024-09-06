package leetcode.algorithms.medium;

import leetcode.algorithms.Node2;

import java.util.HashMap;

// 138. Copy List with Random Pointer
public class CopyListWithRandomPointer {

    public Node2 copyRandomList(Node2 head) {
        HashMap<Node2, Node2> map = new HashMap<>();
        map.put(null, null);

        Node2 dummy = head;
        while (dummy != null) {
            Node2 node = new Node2(dummy.val);
            map.put(dummy, node);
            dummy = dummy.next;
        }
        Node2 curr = head;
        while (curr != null) {
            Node2 copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}
