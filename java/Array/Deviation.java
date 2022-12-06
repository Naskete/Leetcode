package Array;

import java.util.TreeSet;

public class Deviation {
    // TreeSet
    public int minimumDeviation(int[] nums) {
        int n = nums.length;
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(nums[i] = nums[i]%2==0 ? nums[i] : nums[i] * 2);
        }
        int diff = treeSet.last() - treeSet.first();
        // 遍历当前最大值，直到最大值为奇数。
        while (treeSet.last() % 2 == 0) {
            int tmpVal = treeSet.last();
            // 摘出当前节点。
            treeSet.remove(tmpVal);
            // 缩小最大值
            tmpVal /= 2;
            // 重新填回缩小后节点。
            // 注意会自动排序。
            treeSet.add(tmpVal);
            // 记录当前最小差值。
            int tmpDiff = Math.min(diff, treeSet.last() - treeSet.first());
            // 最大值反超时停止，否则越缩差值（绝对值）越大了。
            if (tmpDiff < 0)
                break;
            diff = tmpDiff;
        }
        return diff;
    }
}
