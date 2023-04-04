package String;

import java.util.*;

public class Optional {
    public int partitionString(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int n = s.length();
        char[] arr = s.toCharArray();
        int res = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                res++;
                set.clear();
                set.add(arr[i]);
            }
        }
        if (set.size() > 0) {
            res++;
        }
        return res;
    }
}
