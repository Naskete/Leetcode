package Array;

public class ZeroFilled {
    // time out
    public long zeroFilledSubarray(int[] nums) {
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
}
