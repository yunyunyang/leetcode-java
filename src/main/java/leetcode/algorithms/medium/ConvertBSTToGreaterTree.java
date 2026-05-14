package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

// 538. Convert BST to Greater Tree
public class ConvertBSTToGreaterTree {

    public TreeNode convertBST(TreeNode root) {
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
