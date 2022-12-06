package Array;

import java.util.Arrays;

public class FindK {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n - k];
    }

    public int findKthLargestQuickSort(int[] nums, int k) {
        int n = nums.length;
        quickSort(nums);
        return nums[n - k];
    }

    public void quickSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        process(nums, 0, nums.length - 1);
    }

    public int[] flags(int[] nums, int L, int R) {
        if (L > R) {
            return new int[] {-1, -1};
        }
        if (L == R) {
            return new int[] {L, R};
        }
        int idx = L;
        int less = L - 1, more = R;
        while (idx < more) {
            if (nums[idx] > nums[R]) {
                swap(nums, idx, --more);
            } else if (nums[idx] < nums[R]) {
                swap(nums, idx++, ++less);
            } else {
                idx++;
            }
        }
        swap(nums, more, R);
        return new int[] {less + 1, more};
    }

    public void process(int[] nums, int L, int R) {
        if (L >= R) {
            return;
        }
        swap(nums, L + (int) (Math.random() * (R - L + 1)), R);
        int[] equals = flags(nums, L, R);
        process(nums, L, equals[0] - 1);
        process(nums, equals[1] + 1, R);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}