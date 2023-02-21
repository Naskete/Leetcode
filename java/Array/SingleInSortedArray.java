package Array;

public class SingleInSortedArray {
    // 540 https://leetcode.com/problems/single-element-in-a-sorted-array
    public int singleNonDuplicate(int[] nums) {
        int single = nums[0];
        for (int i = 1; i < nums.length; i++) {
            single ^= nums[i];
        }
        return single;
    }
}
