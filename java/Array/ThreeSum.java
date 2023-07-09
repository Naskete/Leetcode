package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        if (nums == null || len < 3) {
            return list;
        }
        Arrays.sort(nums);
        
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int L = i + 1, R = len - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    list.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 去重
                    while (L < R && nums[L] == nums[L + 1]) L++;
                    while (L < R && nums[R] == nums[R - 1]) R--;
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                } else {
                    R--;
                }
            }
        }
        return list;
    }

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            int idx = 0, n = nums.length;
            while (idx < n) {
                if (nums[idx] > 0) {
                    return list;
                }
                while (idx > 0 && idx < n && nums[idx] == nums[idx - 1]) {
                    idx++;
                }
                int left = idx + 1, right = n - 1;
                while(left < right) {
                    if (nums[idx] + nums[left] + nums[right] == 0) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[idx]);
                        ans.add(nums[left]);
                        ans.add(nums[right]);
                        list.add(ans);
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (nums[idx] + nums[left] + nums[right] > 0) {
                        right--;
                    } else if (nums[idx] + nums[left] + nums[right] < 0) {
                        left++;
                    }
                }
                idx++;
            }
            return list;
        }
    }
}
