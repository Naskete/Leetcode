package Array;

import java.util.HashMap;
import java.util.Map;


// 560. 和为K的子数组 https://leetcode.cn/problems/subarray-sum-equals-k/

public class sub {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int num :nums) {
            sum += num;
            if (sum == k) {
                ans++;
            }
            if (map.containsKey(sum - k)) {
                ans+= map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
