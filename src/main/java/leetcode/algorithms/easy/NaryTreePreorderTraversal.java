package leetcode.algorithms.easy;

import leetcode.algorithms.Node;

import java.util.ArrayList;
import java.util.List;

// 589. N-ary Tree Preorder Traversal
public class NaryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> output = new ArrayList<>();
        dfs(root, output);
        return output;
    }

    private void dfs(Node node, List<Integer> output) {
        if (node == null) {
            return;
        }
        output.add(node.val);
        List<Node> children = node.children;
        for (Node child : children) {
            dfs(child, output);
        }
    }
}
