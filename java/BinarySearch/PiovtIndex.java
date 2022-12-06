package BinarySearch;
public class PiovtIndex {
    public static int findMiddleIndex(int[] nums) {
        int len = nums.length;
        if (len == 1) return 0;
        int sum = 0;
        for(int i = 1; i < len; i++){
            sum += nums[i];
        }
        int left = 0,mid = 0;
        while(mid < len && left != sum){
            left +=nums[mid];
            sum -=nums[mid+1];
            mid++;
        }
        if(left != sum) return -1;
        return mid;
    }
}
