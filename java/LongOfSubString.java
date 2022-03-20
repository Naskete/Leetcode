public class LongOfSubString {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len == 0) return 0;
        int max = 1;
        String str = "";
        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                if(str.indexOf(s.charAt(j))==-1) {
                    str += s.charAt(j);
                } else {
                    max = Math.max(str.length(), max);
                    str = "";
                    break;
                }
            }
        }
        return max;
    }
}
