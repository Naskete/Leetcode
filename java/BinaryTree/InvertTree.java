package BinaryTree;

// 226 invert binary tree
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        exchange(root);
        return root;
    }

    public void exchange(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = right;
        root.right = left;
        exchange(root.left);
        exchange(root.right);
    }
   
}
