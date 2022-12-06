package BinarySearch;
public class FirstBadVersion{
    public static int firstBadVersion(int n) {
        int s = 0, i = 0;
        long l = ((long)s + (long)n) / 2; // 防止溢出
        int mid = (int) l;
        while(s<=n){
            if(isBadVersion(mid)){
                if(!isBadVersion(mid-1)) return mid;
                n = mid - 1;
            } else {
                s = mid + 1;
            }
            l = ((long)s + (long)n)/2;
            mid = (int)l;
        }
        return mid;
    }

    // 题解
    // int left = 1, right = n;
    //     while (left < right) { // 循环直至区间左右端点相同
    //         int mid = left + (right - left) / 2; // 防止计算时溢出
    //         if (isBadVersion(mid)) {
    //             right = mid; // 答案在区间 [left, mid] 中
    //         } else {
    //             left = mid + 1; // 答案在区间 [mid+1, right] 中
    //         }
    //     }
    //     // 此时有 left == right，区间缩为一个点，即为答案
    //     return left;
}