package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

// 98. Validate Binary Search Tree
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean valid(TreeNode node, long left, long right) {
        if (node == null) {
            return true;
        }
        if (!(left < node.val && node.val < right)) {
            return false;
        }
        return (valid(node.left, left, node.val) &&
                valid(node.right, node.val, right));
    }
}
