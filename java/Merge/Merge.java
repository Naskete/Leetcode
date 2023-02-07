package Merge;

// 88 https://leetcode.cn/problems/merge-sorted-array/
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = nums1[i];
        }
        int p = 0, q = 0;
        int idx = 0;
        while (p < m && q < n) {
            nums1[idx++] = arr[p] >= nums2[q] ? nums2[q++] : arr[p++];
        }
        while (p < m) {
            nums1[idx++] = arr[p++];
        }
        while (q < n) {
            nums1[idx++] = nums2[q++];
        }
    }
}
