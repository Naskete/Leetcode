package String;

import java.util.HashMap;
import java.util.Map;

// 953 https://leetcode.com/problems/verifying-an-alien-dictionary/
public class IsSorted {
    public boolean isAlienSorted(String[] words, String order) {
        char[] arr = order.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0;  i < 26; i++) {
            map.put(arr[i], i);
        }
        for (int i = 1; i < words.length; i++) {
            char[] pre = words[i - 1].toCharArray();
            char[] cur = words[i].toCharArray();
            if (map.get(pre[0]) > map.get(cur[0])) {
                return false;
            } else if (map.get(pre[0]) < map.get(cur[0])) {
                continue;
            } else {
                int p = 0, q = 0;
                while (p < pre.length && q < cur.length && pre[p] == cur[q]) {
                    p++;
                    q++;
                }
                if (pre.length > cur.length && q == cur.length) {
                    return false;
                }
                if (p < pre.length && q < cur.length && map.get(pre[p]) > map.get(cur[q])) {
                    return false;
                }
            }
        }
        return true;
    }
}
