package String;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.cn/problems/number-of-different-integers-in-a-string/
public class words {
    public int numDifferentIntegers(String word) {
        word = word.replaceAll("[a-z]+", " ");
        String[] words = word.split(" ");
        Set<String> set = new HashSet<>();
        for (String w : words) {
            if(w.equals("")) continue;
            w = w.replaceAll("^0*","");
            set.add(w);
        }
        return set.size();
    }

    // double pointer
    public int numDifferentIntegersDoublePointer(String word) {
        return 0;
    }
}
