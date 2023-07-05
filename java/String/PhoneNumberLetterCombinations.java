package String;

import java.util.*;

public class PhoneNumberLetterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        backTrack(digits, 0, digits.length(), list, map, "");
        return list;
    }

    public void backTrack(String dights, int cur, int len, List<String> list, Map<Character, String> map, String ans) {
        if (cur == len) {
            list.add(ans);
            return;
        }
        char c = dights.charAt(cur);
        String s = map.get(c);
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            String add = ans + ch;
            backTrack(dights, cur + 1, len, list, map, add);
        }
    }
}
