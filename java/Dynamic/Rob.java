package Dynamic;

public class Rob {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if (n == 1) {
            return nums[0];
        } 
        if (n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(process(nums, 0, n - 2), process(nums, 1, n - 1));
    }

    public int process(int[] nums, int start, int end) {
        int first = nums[start], second = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i <= end; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }
}
