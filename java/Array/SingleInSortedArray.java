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

    // 异或求解
    // 但是这里给的是有序的列表
    public int singleNonDuplicateInSortedArray(int[] nums) {
        
        int left=0,right=nums.length-1;
        while(left<right){
          int mid=left+(right-left)/2;
          boolean iseven=(right-mid)%2==0;
          if(nums[mid]==nums[mid-1]){
             if(iseven){
                 right=mid-2;//ignore the duplicate element
             }
             else{
                 left=mid+1;
             }
          }
          else if(nums[mid]==nums[mid+1])
          {
              if(iseven){
                  left=mid+2;
              }else{
                  right=mid-1;
              }
          }else{
              return nums[mid];
          }
            

        }
        return nums[left];
    }
}
