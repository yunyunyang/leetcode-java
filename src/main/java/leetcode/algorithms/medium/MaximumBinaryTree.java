package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

// 654. Maximum Binary Tree
public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int maxVal = -1, index = -1;
        for (int i = left; i <= right; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                index = i;
            }
        }

        TreeNode node = new TreeNode(maxVal);
        node.left = build(nums, left, index - 1);
        node.right = build(nums, index + 1, right);

        return node;
    }
}
