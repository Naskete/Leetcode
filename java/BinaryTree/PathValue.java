package BinaryTree;

public class PathValue {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        return pathValue(root, targetSum, 0);
    }

    public boolean pathValue(TreeNode root, int target, int sum){
        if(root == null){
            return false;
        }
        sum += root.val;
        if(root.left==null && root.right == null){
            return sum==target;
        }
        return pathValue(root.left, target, sum) || pathValue(root.right, target, sum);
    }

    public boolean PathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        return PathSum(root.left, targetSum - root.val) || PathSum(root.right, targetSum - root.val);
    }
}
