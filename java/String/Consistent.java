package String;

//https://leetcode.cn/problems/count-the-number-of-consistent-strings/
public class Consistent {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] alloweds = allowed.toCharArray();
        int res = 0;
        for (String word :words) {
            for (char c : alloweds) {
                word = word.replaceAll(String.valueOf(c), "");
            }
            if (word.equals("")) {
                res++;
            }
        }
        return res;
    }
}