package BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class Rebuild {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int m = preorder.length, n = inorder.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(inorder[i], i);
        }
        return build(preorder, 0, 0, m - 1, map);
    }

    public TreeNode build(int[] preorder, int root, int left, int right, Map<Integer, Integer> map) {
        if (left > right) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[root]);
        int idx = map.get(preorder[root]); //idx 根节点在中序遍历中的索引
        // 左子树长度 = idx - left;
        node.left = build(preorder, root + 1, left, idx - 1, map);
         // root + idx - left + 1  根节点+ 左子树长度 + 1
        node.right = build(preorder, root + idx - left + 1, idx + 1, right , map);
        return node;
    }
}
