package BinarySearch;

public class FindMin {
    public int findMin(int[] nums) {
        int len = nums.length;
        int left = 0, right = len - 1;
        if (nums[left] < nums[right]) {
            return nums[left];
        }
        while (left < right) {
           int mid = (left + right) / 2;
           if (nums[left] > nums[right]) {
               if (nums[mid] >= nums[left]) {
                   left = mid + 1;
               } else {
                   right = mid;
               }
           } else {
               right = left;
           }
        }
        return nums[right];
    }
}
