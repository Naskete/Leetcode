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
    // 2348 dp
    // 每多一个连续的0, 都可以和上一个0所构成的子数组 构成一个新的子数组
    public long zeroFilledSubarrayDP(int[] nums) {
        long count = 0;//答案
        int zeroCnt = 0;//当前0的个数
        for (int x : nums) {
            if (x == 0) {
                zeroCnt++;
                count += zeroCnt;
            } else {
                zeroCnt = 0;
            }
        }
        return count;
    }
}
