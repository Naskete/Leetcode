package Array;

public class ZeroFilled {
    // time out
    public long zeroFilledSubarrayT(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            int idx = i;
            if (nums[idx] == 0) {
                res++;
                while (idx + 1 < n && nums[idx + 1] == 0) {
                    res++;
                    idx++;
                }
            }
        }
        return res;
    }

    public long zeroFilledSubarray(int[] nums) {
        long ans = 0L;
        long c = 0;
        for (int num : nums)
            if (num != 0) c = 0;
            else ans += ++c;
        return ans;
    }
}
