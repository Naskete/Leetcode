package Array;
import java.util.*;

// 496 https://leetcode.com/problems/next-greater-element-i
public class NextGreatElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = len2 - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        int idx = 0;
        int[] res = new int[len1];
        for (int num : nums1) {
            res[idx++] = map.get(num);
        }
        return res;
    }
}
