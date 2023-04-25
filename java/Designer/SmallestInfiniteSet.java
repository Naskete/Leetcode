package Designer;

import java.util.Set;
import java.util.TreeSet;

public class SmallestInfiniteSet {
    // Set 实现
    private Set<Integer> set;

    public SmallestInfiniteSet() {
        this.set = new TreeSet<>();
        for (int i = 1; i <= 1000; i++) {
            set.add(i);
        }
    }
    
    public int popSmallest() {
        if (this.set.isEmpty()) {
            return -1;
        }
        int res = this.set.stream().findFirst().get();
        set.remove(res);
        return res;
    }
    
    public void addBack(int num) {
        set.add(num);
    }

    // int 数组实现
    private int[] nums;
    private int minIdx;

    public SmallestInfiniteSet(int size) {
        this.nums = new int[1000];
        for (int i = 0; i < 1000; i++) {
            nums[i] = i + 1;
        }
        this.minIdx = 0;
    }
    
    public int popSmallestI() {
        if (minIdx == 1000) {return -1;}
        int res = nums[minIdx];
        nums[minIdx] = -1;
        while (minIdx < 1000 && nums[minIdx] == -1) {
            minIdx++;
        }
        if (minIdx == 1000) {
            minIdx = 0;
        }
        return res;
    }
    
    public void addBackI(int num) {
        if (nums[num - 1] == -1) {
            nums[num - 1] = num;
            if (num < nums[minIdx]) {
                minIdx = num - 1;
            }
        } else {
            return;
        }
    }
}
