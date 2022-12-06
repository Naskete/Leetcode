package Merge;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int[] help = new int[m + n];
        int idx = 0;
        while (i < m && j < n) {
            help[idx++] = nums1[i] > nums2[j] ? nums2[j++] : nums1[i++];
        }
        while (i < m) {
            help[idx++] = nums1[i++];
        }
        
        while (j < n) {
            help[idx++] = nums2[j++];
        }
        for (int k = 0; k < m + n; k++) {
            nums1[k] = help[k];
        }
    }
}
