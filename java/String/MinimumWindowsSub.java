package String;

import java.util.*;

public class MinimumWindowsSub {
    public String minWindow(String s, String t) {
        Map<Character, Integer> cur = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        int i = 0, j = -1;
        int sLen = s.length();
        int res = Integer.MAX_VALUE, lRes = -1, rRes = -1;
        while (j < sLen) {
            j++;
            if (j < sLen && need.containsKey(s.charAt(j))) {
                cur.put(s.charAt(j), cur.getOrDefault(s.charAt(j), 0) + 1);
            }
            while(check(cur, need) && i<= j) {
                if (j - i + 1 < res) {
                    res = j - i + 1;
                    lRes = i;
                    rRes = i + res;
                }
                if (need.containsKey(s.charAt(i))) {
                    cur.put(s.charAt(i), cur.getOrDefault(s.charAt(i), 0) - 1);
                }
                ++i;
            }
        }
        return lRes == -1 ? "" : s.substring(lRes, rRes);
    }

    public boolean check(Map<Character, Integer> cur, Map<Character, Integer> need) {
        Iterator iter = need.entrySet().iterator(); 
        while (iter.hasNext()) { 
            Map.Entry entry = (Map.Entry) iter.next(); 
            Character key = (Character) entry.getKey(); 
            Integer val = (Integer) entry.getValue(); 
            if (cur.getOrDefault(key, 0) < val) {
                return false;
            }
        } 
        return true;
    }
}
