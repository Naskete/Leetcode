package BinaryTree;

public class Depth {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);
        return Math.max(left_depth, right_depth) + 1;
    }

    // 自上而下
    private int answer; // don't forget to initialize answer before call maximum_depth

    private void maximum_depth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        maximum_depth(root.left, depth + 1);
        maximum_depth(root.right, depth + 1);
    }

    // 自下而上
    public int maximum_depth(TreeNode root) {
        if (root == null) {
            return 0; // return 0 for null node
        }
        int left_depth = maximum_depth(root.left);
        int right_depth = maximum_depth(root.right);
        return Math.max(left_depth, right_depth) + 1; // return depth of the subtree rooted at root
    }

    public int depth(TreeNode root) {
        int ans = 0;
        if(root == null) return ans;

        return ans;
        // int ans = 0;
        // if (root == null)
        //     return ans;
        // Queue<TreeNode> queue = new LinkedList<>();
        // TreeNode node = root;
        // queue.offer(node);
        // while (queue.isEmpty()) {
        //     int num = queue.size();
        //     for (int i = 0; i < num; i++) {
        //         node = queue.poll();
        //         if (node.left != null) {
        //             queue.add(node.left);
        //         }
        //         if (node.right != null) {
        //             queue.add(node.right);
        //         }
        //     }
        //     ans++;
        // }
        // return ans;
    }
}
