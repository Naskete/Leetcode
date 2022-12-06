package String;

import java.util.HashSet;
import java.util.Set;

public class Unique {
    public boolean isUnique(String astr) {
        char[] str = astr.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c : str) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
