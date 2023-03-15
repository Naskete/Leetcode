package BinaryTree;

import java.util.List;
import java.util.ArrayList;

public class IsComplete {
    // 958 Check Completeness of a Binary Tree
    public boolean isCompleteTree(TreeNode root) {
        List<Node> nodes = new ArrayList<>();
        nodes.add(new Node(root, 1));
        int i =0;
        while (i < nodes.size()) {
            Node node = nodes.get(i);
            if (node.node != null) {
                nodes.add(new Node(node.node.left, node.code * 2));
                nodes.add(new Node(node.node.right, node.code * 2 + 1));
            }
            i++;
        }
        return nodes.get(i- 1).code == nodes.size();
    }

    public class Node{
        TreeNode node;
        int code;
        public Node(TreeNode node, int code) {
            this.node = node;
            this.code = code;
        }
    }
}
