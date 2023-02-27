package Array;

public class RemoveElement {
    public int deleteElement(int[] nums, int val) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == val) {
                swap(nums, left, right--);
            } else {
                left++;
            }
        }
        return left;
    }

    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
