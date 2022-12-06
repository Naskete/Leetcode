package Array;
public class MoveZero {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for(int i = 0, j = 0; i < len;i++){
            if(nums[i]!=0){
                arr[j] = nums[i];
                j++;
            }
        }
        for(int i = 0; i < len; i++){
            nums[i] = arr[i];
        }
    }
}
