package Array;

import java.util.ArrayList;
import java.util.List;

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
}
