package Array;

// 921 https://leetcode.com/problems/sort-an-array
public class Sorted {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    public void mergeSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        process(nums, 0, nums.length - 1);
    }

    public void process(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        process(nums, left, mid);
        process(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] help  = new int[right - left + 1];
        int p = left, q = mid + 1;
        int idx = 0;
        while (p <= mid && q <= right) {
            help[idx++] = nums[p] <= nums[q] ? nums[p++] : nums[q++]; 
        }
        while (p <= mid) {
            help[idx++] = nums[p++];
        }
        while (q <= right) {
            help[idx++] = nums[q++];
        }
        for (int i = 0; i < help.length; i++) {
            nums[left + i] = help[i];
        }
    }
}
