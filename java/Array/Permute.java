package Array;

import java.util.ArrayList;
import java.util.List;

public class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        process(nums, 0, list);
        return list;
   }

   public void process(int[] nums, int idx, List<List<Integer>> list) {
       if (idx == nums.length) {
           List<Integer> ans = new ArrayList<>();
           for (int i = 0; i < nums.length; i++) {
               ans.add(nums[i]);
           }
           list.add(ans);
           return;
       }
       for (int i = idx; i < nums.length; i++) {
           swap(nums, i, idx);
           process(nums, idx + 1, list);
           swap(nums, i, idx);
       }
   }

   public void swap(int[] nums, int i, int j) {
       int tmp = nums[i];
       nums[i] = nums[j];
       nums[j] = tmp;
   }
}
