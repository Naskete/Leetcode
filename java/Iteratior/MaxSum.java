package Iteratior;

import java.util.Arrays;

public class MaxSum {
    // 寻找迭代规律：F(k)=F(k−1)+numSum−n×nums[n−k]
    public int maxRotateFunction(int[] nums) {
        int max = 0, f = 0, len = nums.length, sum = Arrays.stream(nums).sum();
        for(int i = 0; i < len; i++){
            f += i*nums[i];
        }
        max = f;
        // F(k)=F(k−1)+numSum−n×nums[n−k]
        for(int i = 0; i < len; i++){
            f = f + sum - len*nums[len-i-1];
            max = Math.max(f, max);
        }
        return max;
    }

    // 暴力超时
    public int myMaxRotateFunction(int[] nums) {
        if(nums.length <= 1) return 0;
        int max = -1000000000,sum = 0,len=nums.length;
        for(int n = 0; n < len; n++){
            for(int i = 0; i < len; i++){
                sum += nums[(i+n)%len]*i;
            }
            max = Math.max(sum, max);
            sum = 0;
        }
        return max;
    }
}
