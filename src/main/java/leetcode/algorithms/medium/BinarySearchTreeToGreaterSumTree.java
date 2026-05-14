package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

// 1038. Binary Search Tree to Greater Sum Tree
public class BinarySearchTreeToGreaterSumTree {

    public TreeNode bstToGst(TreeNode root) {
        traverse(root);
        return root;
    }

    int sum = 0;
    void traverse(TreeNode node) {
        if (node == null)
            return;

        traverse(node.right);
        sum += node.val;
        node.val = sum;
        traverse(node.left);
    }
}
