package Array;

public class FindMidianSorted {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int mid = (m + n) / 2;
        int idx = 0, i = 0, j = 0;
        int[] help = new int[m + n];
        while (i < m && j < n) {
            help[idx++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
        }
        while (i < m) {
            help[idx++] = nums1[i++];
        }
        while (j < n) {
            help[idx++] = nums2[j++];
        }
        return (m + n) % 2 != 0 ? help[mid] * 1.0 : (help[mid - 1] + help[mid]) / 2.0;
    }
}