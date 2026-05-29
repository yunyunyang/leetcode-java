package leetcode.algorithms.medium;

import leetcode.algorithms.Node3;

// 116. Populating Next Right Pointers in Each Node
public class PopulatingNextRightPointersInEachNode {

    public Node3 connect(Node3 root) {
        if (root == null)
            return null;

        traverse(root.left, root.right);
        return root;
    }

    void traverse(Node3 node1, Node3 node2) {
        if (node1 == null || node2 == null)
            return;

        node1.next = node2;

        traverse(node1.left, node1.right);
        traverse(node2.right, node2.right);
        traverse(node1.right, node2.left);
    }
}
