package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

// 450. Delete Node in a BST
public class DeleteNodeInABST {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val == key) {
            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            TreeNode minNode = getMin(root.right);
            root.right = deleteNode(root.right, minNode.val);
            minNode.left = root.left;
            minNode.right = root.right;
            root = minNode;

        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        return root;
    }

    TreeNode getMin(TreeNode node) {
        while (node.left != null)
            node = node.left;

        return node;
    }
}
