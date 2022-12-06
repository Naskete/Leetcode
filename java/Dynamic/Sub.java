package Dynamic;

import java.util.HashMap;
import java.util.Map;

public class Sub {
    public int numDistinct(String s, String t) {
        Map<String, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        process(chars, 0, chars.length, "", map);
        if (map.containsKey(t)) {
            return map.get(t);
        }
        return 0;
    }

    public void process(char[] str, int idx, int n, String path, Map<String, Integer> map) {
        if (idx == n) {
            if (map.containsKey(path)) {
                 map.put(path, map.get(path) + 1);
            } else {
                map.put(path, 1);
            }
            return;
        }
        String yes = path + String.valueOf(str[idx]);
        process(str, idx + 1, n, yes, map);
        process(str, idx + 1, n, path, map);
    }
}
