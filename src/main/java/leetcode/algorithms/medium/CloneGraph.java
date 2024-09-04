package leetcode.algorithms.medium;

import leetcode.algorithms.Node;

import java.util.HashMap;
import java.util.Map;

// 133. Clone Graph
public class CloneGraph {

    public Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();
        return dfs(node, map);
    }

    private Node dfs(Node node, Map<Node, Node> map) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node copy = new Node(node.val);
        map.put(node, copy);
        for (Node neighbor : node.children) {
            copy.children.add(dfs(neighbor, map));
        }
        return copy;
    }
}
