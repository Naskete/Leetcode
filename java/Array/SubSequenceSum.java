package Array;

import java.util.ArrayList;
import java.util.List;

import Array.ThreeSum.Solution;

public class SubSequenceSum {
    public long maxAlternatingSum(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        getResult(nums, 0, n, 0, 1, list);
        int max = 0;
        for (int v : list) {
            max = Math.max(v, max);
        }
        return max;
    }

    public void getResult(int[] nums, int cur, int len, int val, 
    int flag, List<Integer> value) {
        if (cur == len) {
            value.add(val);
            return;
        }
        int add =val + flag * nums[cur];
        getResult(nums, cur + 1, len, add, -flag, value);
        int next = val;
        getResult(nums, cur + 1, len, next, flag, value);
    }

    public long maxAlternatingSumL(int[] nums) {
        long even = nums[0], odd = 0;
        for (int i = 1; i < nums.length; i++) {
            even = Math.max(even, odd + nums[i]);
            odd = Math.max(odd, even - nums[i]);
        }
        return even;
    }
}
