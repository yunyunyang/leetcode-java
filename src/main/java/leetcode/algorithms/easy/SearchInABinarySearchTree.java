package leetcode.algorithms.easy;

import leetcode.algorithms.TreeNode;

// 700. Search in a Binary Search Tree
public class SearchInABinarySearchTree {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val > val)
            return searchBST(root.left, val);
        if (root.val < val)
            return searchBST(root.right, val);

        return root;
    }

}
