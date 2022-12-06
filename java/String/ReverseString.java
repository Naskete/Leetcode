package String;
public class ReverseString {
    public void reverseString(char[] s) {
        // 转字符串
        String str = String.valueOf(s);
        for(int i = 0; i < s.length; i++){
            s[i] = str.charAt(s.length - i -1);
        }
        // 双指针
        int left = 0, right = s.length-1;
        while(left < right){
            char temp = s[right];
            s[right--] = s[left];
            s[left++] = temp;
        }
    }
}
