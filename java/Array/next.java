package Array;

public class next {
    public void nextPermutation(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int i = len - 2, j = len - 1, k = len - 1;
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }
        if (i >= 0) {
            while (k >= 0 && nums[k] <= nums[i]) {
                k--;
            }
            swap(nums, i, k);
        }
        reverse(nums, j, len - 1);
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(int[] nums, int i, int j) {
        int left = i, right = j;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public int nextGreaterElement(int n) {
        char[] nums = Integer.toString(n).toCharArray();
        int len = nums.length;
        if (len < 2) {
            return -1;
        }
        int i = len - 2, j = len - 1, k = len - 1;
        while (i >= 0 && nums[i] >= nums[j]) {
            i--;
            j--;
        }
        if (i < 0 ) {
            return -1;
        } 
        if (i >= 0) {
            while (k >= 0 && nums[k] <= nums[i]) {
                k--;
            }
            swap(nums, i, k);
        }
        reverse(nums, j, len - 1);
        long ans = Long.parseLong(String.valueOf(nums));
        return ans > Integer.MAX_VALUE? -1 : (int)ans;
    }

    public void swap(char[] nums, int i, int j) {
        char tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    public void reverse(char[] nums, int i, int j) {
        int left = i, right = j;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
