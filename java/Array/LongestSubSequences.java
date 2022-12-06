package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/longest-consecutive-sequence
public class LongestSubSequences {
    // sort
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return 0;
        }
        int ans = 0, count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] + 1) {
                count++;
            } else if (nums[i] == nums[i - 1]) {
                continue;
            } else {
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }

    // O(n)
    // 判断是否跳过
    // 由于我们要枚举的数 x 一定是在数组中不存在前驱数 x-1x−1 的
    // 不然按照上面的分析我们会从 x-1x−1 开始尝试匹配，因此我们每次在哈希表中检查是否存在 x-1
    // 即能判断是否需要跳过了。
    public int longestConsecutiveI(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }
        int ans = 0;
        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int current = 1;
                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    current += 1;
                }
                ans = Math.max(ans, current);
            }
        }
        return ans;
    }
}
