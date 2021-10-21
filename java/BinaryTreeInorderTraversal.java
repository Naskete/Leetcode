public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inOrder(root,res);
        return res;
    }
    public void inOrder(TreeNode root, List<Integer> arr){
        if(root != null){
            if(root.left!=null){
                inOrder(root.left, arr);
            }
            arr.add(root.val);
            if(root.right!=null){
                inOrder(root.right, arr);
            }
        }
    }
}