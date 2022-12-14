package Array;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.cn/problems/degree-of-an-array/
public class Degree {
    public int findShortestSubArray(int[] nums) { // 2595/46.3/
        if (nums.length < 1) return 1;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            max = Math.max(max, map.get(num));
        }
        int res = Integer.MAX_VALUE;
        for (int num : nums) {
            if (map.get(num) == max) {
                int left = 0, right = nums.length - 1;
                while (nums[left] != num) {
                    left++;
                }
                while (nums[right] != num) {
                    right--;
                }
                int len = right - left + 1;
                res = Math.min(res, len);
            }
        }
        return res;
    }
}
