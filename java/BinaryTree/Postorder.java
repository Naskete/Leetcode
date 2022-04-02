package BinaryTree;

import java.util.*;

public class Postorder {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        traversal(root.left, list);
        traversal(root.right, list);
        list.add(root.val);
    }
}
