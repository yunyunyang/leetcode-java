package leetcode.algorithms.easy;

import leetcode.algorithms.Node;

import java.util.ArrayList;
import java.util.List;

// 590. N-ary Tree Postorder Traversal
public class NaryTreePostorderTraversal {

    public List<Integer> postorder(Node root) {
        List<Integer> output = new ArrayList<>();
        dfs(root, output);
        return output;
    }

    private void dfs(Node node, List<Integer> output) {
        if (node == null) {
            return;
        }
        List<Node> children = node.children;
        for (Node child : children) {
            dfs(child, output);
        }
        output.add(node.val);
    }
}
