package String;

import java.util.*;

// 1807 https://leetcode.cn/problems/evaluate-the-bracket-pairs-of-a-string/
public class ReplacePair {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        char[] arr = s.toCharArray();
        int idx = 0, len = s.length();
        StringBuilder str = new StringBuilder();
        while (idx < len) {
            if (arr[idx] == '(') {
                idx++;
                StringBuilder key = new StringBuilder();
                while(idx < len && arr[idx] != ')') {
                    key.append(arr[idx++]);
                }
                idx++;
                String value = map.getOrDefault(key.toString(), "?");
                str.append(value);
            } else {
                str.append(arr[idx++]);
            }
        }
        return str.toString();
    }
}
