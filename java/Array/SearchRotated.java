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

    // offical~
    public int searchI(int[] nums, int target) {
        int n = nums.length;
        if (n == 0) {
            return -1;
        }
        if (n == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[n - 1]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }
}
