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
        Set<String> set = new HashSet<String>();
        int n = word.length(), p1 = 0, p2;
        while (true) {
            while (p1 < n && !Character.isDigit(word.charAt(p1))) {
                p1++;
            }
            if (p1 == n) {
                break;
            }
            p2 = p1;
            while (p2 < n && Character.isDigit(word.charAt(p2))) {
                p2++;
            }
            while (p2 - p1 > 1 && word.charAt(p1) == '0') { // 去除前导 0
                p1++;
            }
            set.add(word.substring(p1, p2));
            p1 = p2;
        }
        return set.size();
    }
}
