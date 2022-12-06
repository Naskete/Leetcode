package String;

public class ReverseKChars {
    public String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        String front = String.valueOf(chars, 0, n);
        String back = String.valueOf(chars, n, chars.length - n);
        return back + front;
    }
}
   