package Array;

import java.util.*;

import javax.lang.model.element.QualifiedNameable;;

// 921 https://leetcode.com/problems/sort-an-array
public class Sorted {
    public int[] sortArray(int[] nums) {
        mergeSort(nums);
        return nums;
    }

    public void mergeSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        process(nums, 0, nums.length - 1);
    }

    public void process(int[] nums, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = left + ((right - left) >> 1);
        process(nums, left, mid);
        process(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    public void merge(int[] nums, int left, int mid, int right) {
        int[] help  = new int[right - left + 1];
        int p = left, q = mid + 1;
        int idx = 0;
        while (p <= mid && q <= right) {
            help[idx++] = nums[p] <= nums[q] ? nums[p++] : nums[q++]; 
        }
        while (p <= mid) {
            help[idx++] = nums[p++];
        }
        while (q <= right) {
            help[idx++] = nums[q++];
        }
        for (int i = 0; i < help.length; i++) {
            nums[left + i] = help[i];
        }
    }

    // quick sort

    public void quickSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        process(nums, 0, nums.length - 1);
    }

    public void quickProcess(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        swap(nums, right, (int)(Math.random() * (right - left + 1)) + left);
        int[] equals = getEquals(nums, left, right);
        quickProcess(nums, left, equals[0] - 1);
        quickProcess(nums, equals[1] + 1, right);
    }

    public int[] getEquals(int[] nums, int L, int R) {
        if (L > R) {
            return new int[] {-1, -1};
        }

        if (L == R) {
            return new int[] {L, L};
        }
        int flag = nums[R];
        int less = L - 1, more = R;
        int idx = L;
        while (idx < more) {
            if (nums[idx] > flag) {
                swap(nums, idx, --more);
            } else if (nums[idx] < flag) {
                swap(nums, ++less, idx++);
            } else {
                idx++;
            }
        }
        swap(nums, R, more);
        return new int[]{less + 1, more};
    }

    public void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public void quickSortUnRec(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int n = nums.length;
        swap(nums, (int)(Math.random() * n), n - 1);
        int[] equals = getEquals(nums, 0, n - 1);
        int ll = 0, lr = equals[0] - 1;
        int rl = equals[1] + 1, rr = n - 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(ll);
        stack.push(lr);
        stack.push(rl);
        stack.push(rr);
        while(!stack.isEmpty()) {
            int R = stack.pop();
            int L = stack.pop();
            if (L < R) {
                swap(nums, (int)(Math.random() * (R - L + 1)) + L, R);    
                equals = getEquals(nums, L, R);
                stack.push(L);
                stack.push(equals[0] - 1);
                stack.push(equals[1] + 1);
                stack.push(R);
            }
        }
    }

    public void mergeSortUnrec(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int mergeSize = 1;
        int N = nums.length;
        while (mergeSize < N) {
            int L = 0;
            while (L < N) {
                if (mergeSize >= N - L) {
                    break;
                }
                int M = L + mergeSize - 1;
                int R = M + Math.min(mergeSize, N - M - 1);
                merge(nums, L, M, R);
                L = R  + 1;
            }
            if (mergeSize * 2 > N) {
                break;
            }
            mergeSize <<= 1;
        }
    }
}
