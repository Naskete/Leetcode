package Merge;
public class reversePair {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        return process(nums, 0, nums.length - 1);
    }
    public int process(int[] arr, int left, int right) {
        if (left == right) {
            return 0;
        }
        int mid = left + ((right - left) >> 1);
        return process(arr, left, mid) + process(arr, mid + 1, right) + merge(arr, left, mid, right);
    }

    public int merge(int[] arr, int left, int mid, int right) {
        int res = 0;
        int wr = mid + 1;
        for (int i = left; i <= mid; i++) {
            while(wr <= right && (long)arr[i] > (long) arr[wr] * 2) {
                wr++;
            }
            res += wr - mid - 1;
        }
        int p1 = left, p2 = mid + 1;
        int idx = 0;
        int[] help = new int[right - left + 1];
        while (p1 <= mid && p2 <= right) {
            help[idx++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++]; // 保证顺序正确，保证arr[p1]要算的值算完
        }
        while (p1 <= mid) {
            help[idx++] = arr[p1++];
        }
        while (p2 <= right) {
            help[idx++] = arr[p2++];
        }
        // System.arraycopy(help, 0, arr, left, help.length);
        for (int i = 0; i < help.length; i++) {
            arr[left + i] = help[i];
        }
        return res;
    }
}