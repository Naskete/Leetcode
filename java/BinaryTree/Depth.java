package BinaryTree;

public class Depth {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }
}
