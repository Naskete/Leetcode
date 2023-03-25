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

    // quick sort

    public void quickSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        process(nums, 0, nums.length - 1);
    }

    public void quickProcess(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        swap(nums, right, (int)(Math.random() * (right - left + 1)) + left);
        int[] equals = getEquals(nums, left, right);
        quickProcess(nums, left, equals[0] - 1);
        quickProcess(nums, equals[1] + 1, right);
    }

    public int[] getEquals(int[] nums, int L, int R) {
        if (L > R) {
            return new int[] {-1, -1};
        }

        if (L == R) {
            return new int[] {L, L};
        }
        int flag = nums[R];
        int less = L - 1, more = R;
        int idx = L;
        while (idx < more) {
            if (nums[idx] > flag) {
                swap(nums, idx, --more);
            } else if (nums[idx] < flag) {
                swap(nums, ++less, idx++);
            } else {
                idx++;
            }
        }
        swap(nums, R, more);
        return new int[]{less + 1, more};
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


}
