package Array;

import java.util.Arrays;

public class SuccessPair {
    // 2300. successful pairs of spells and potions
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m = spells.length;
        int n = potions.length;
        Arrays.sort(potions);
        int[] res = new int[m];
        for (int i = 0; i < m; i++) {
            long spell = spells[i];
            int idx = 0;
            while (idx < n && potions[idx] * spell < success) {
                idx++;
            }
            res[i] = n - idx;
        }
        return res;
    }
}
