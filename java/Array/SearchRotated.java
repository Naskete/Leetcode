package Array;

public class SearchRotated {
    // 33 search in rotate sorted array
    public int search(int[] nums, int target) {
        int n = nums.length;
        int L = 0, R = n - 1;
        if (L == R) return nums[L] == target ? L : -1;
        if (nums[L] == target) return L;
        if (nums[R] == target) return R;
        while (L < R) {
            int M = L + (R - L)/2;
            if (nums[M] == target) return M;
            if (target > nums[R]) {
                if (nums[M] > target) {
                    R = M;
                } else {
                    if (nums[M] > nums[L]) {
                        L = M + 1;
                    } else {
                        R = M;
                    }
                }
            } else {
                if (nums[M] > target) {
                    if (nums[M] > nums[R]) {
                        L = M + 1;
                    } else {
                        R = M;
                    }
                } else {
                    L = M + 1;
                }
            }
        }
        return -1;
    }
}
