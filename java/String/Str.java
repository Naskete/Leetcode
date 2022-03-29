package String;
public class Str {
    public int strStr(String haystack, String needle) {
        if(needle.equals("") || (needle.equals(haystack))) return 0;
        if(needle.length() > haystack.length()) return -1;
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            for(int j = 0; j < needle.length(); j++){
                if(!(haystack.charAt(i+j)==needle.charAt(j))){
                    break;
                }
                if(j== needle.length()-1){
                    return i;
                }
            }
        }
        return -1;
    }
}
