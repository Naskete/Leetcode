package Array;
public class RotateList {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k%len;
        if(len > 1){
            int[] arr = new int[k];
            System.arraycopy(nums, len-k, arr, 0, k);
            if (len - (k - 1) >= 0) System.arraycopy(nums, 0, nums, k, len - k);
            System.arraycopy(arr, 0, nums, 0, k);
        }
    }
}
