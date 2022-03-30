package BinaryTree;

import java.util.*;

public class Preorder {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        traversal(root.left, list);
        traversal(root.right, list);
    }
}
