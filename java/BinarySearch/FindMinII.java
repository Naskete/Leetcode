package BinarySearch;

public class FindMinII {
    // 存在重复
    // 可能出现 1 2 1 / 10 9 10 的情况
    public int minArray(int[] numbers) {
        int n = numbers.length;
        int l = 0, r =  n - 1;
        if (numbers[l] < numbers[r]) {
            return numbers[l];
        }
        while (l < r) {
            int mid = l + (r - l)/2;
            while(r > l && numbers[r] == numbers[l]) {
                r--;
            }
            if (numbers[l] >= numbers[r]) {
                if (numbers[mid] >= numbers[l]) {
                    l = mid + 1;
                } else {
                    r = mid;
                }
            } else {
                r = l;
            }
        }
        return numbers[r];
    }
}
