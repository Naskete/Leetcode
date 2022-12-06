package Array;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class NextGreat {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int[] ans = new int[l1];
        for (int i = 0; i < l1; i++) {
            ans[i] = -1;
        }
        for (int i = 0; i < l1; i++) {
            int idx = 0;
            while (nums2[idx] != nums1[i]) {
                idx++;
            }
            for (int j = idx; j < l2; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }

    public int[] nextGreaterElementI(int[] nums1, int[] nums2) {
        int l1 = nums1.length, l2 = nums2.length;
        int[] ans = new int[l1];
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = l2 - 1; i >= 0; i--) {
            int num = nums2[i];
            while (!stack.isEmpty() && num > stack.peek()) {
                stack.pop();
            }
            map.put(num, stack.isEmpty()? -1 : stack.peek());
            stack.push(num);
        }
        for (int i = 0; i < l1; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    
    // 循环且存在重复，使用map会覆盖
    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 2 * len - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i % len] >= stack.peek()) {
                stack.pop();
            }
            ans[i%len] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(nums[i%len]);
        }
        return ans;
    }

    
}