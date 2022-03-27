public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            int j = i, len = 0;
            while(j < nums.length&&nums[j]==1){
                len++;
                j++;
            }
            max = Math.max(max, len);
            i = j;
        }
        return max;
    }
}
