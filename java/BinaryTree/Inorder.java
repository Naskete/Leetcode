package BinaryTree;
import java.util.*;

public class Inorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    public void traversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        traversal(root.left, list);
        list.add(root.val);
        traversal(root.right, list);
    }
}
