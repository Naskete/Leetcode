package Number;

public class NextGreatNumber {
    // 563. https://leetcode.com/problems/next-greater-element-iii
    public int nextGreaterElement(int n) {
        String number = String.valueOf(n);
        char[] nums = number.toCharArray();
        int len = nums.length;
        int idx = len - 1;
        while (idx > 0 && nums[idx - 1]  >= nums[idx]) {
            idx--;
        }
        if (idx == 0) {
            return -1;
        }
        int great = len - 1;
        while (nums[great] <= nums[idx - 1]) great--;
        swap(nums, idx - 1, great);
        for (int i = idx; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] < nums[i]) {
                    swap(nums, i, j);
                }
            }
        }
        String res = String.valueOf(nums);
        return Long.parseLong(res) > Integer.MAX_VALUE ? -1 : Integer.parseInt(res);
    }

    public void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
