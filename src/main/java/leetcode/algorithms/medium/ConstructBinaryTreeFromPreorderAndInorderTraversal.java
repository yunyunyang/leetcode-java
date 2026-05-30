package leetcode.algorithms.medium;

import leetcode.algorithms.TreeNode;

import java.util.HashMap;
import java.util.Map;

// 105. Construct Binary Tree from Preorder and Inorder Traversal
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    TreeNode build(int[] preorder, int preStart, int preEnd,
                   int[] inorder, int inStart, int inEnd) {

        if (preStart > preEnd)
            return null;

        int rootVal = preorder[preStart];
        int index = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == rootVal) {
                index = i;
            }
        }
        int leftSize = index - inStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = build(preorder, preStart + 1, preStart + leftSize,
                inorder, inStart, inStart + leftSize);
        root.right = build(preorder, preStart + leftSize + 1, preEnd,
                inorder, index + 1, inEnd);

        return root;
    }
}
