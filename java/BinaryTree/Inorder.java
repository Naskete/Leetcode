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

    public List<Integer> inorder(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(!stack.empty() || node != null){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            list.add(node.val);
            node = node.right;
        }
        return list;
    }
}
