package String;
public class ReverseWords {
    public String reverseWords(String s) {
        String[] strings = s.split("\\s");
        int len = strings.length;
        String s1 = "";
        for(int i = 0; i < len; i++){
            int index = strings[i].length() - 1;
            while(index>=0){
                s1 += strings[i].charAt(index--);
            }
            if(i == len - 1) break;
            s1 +=" ";
        }
        return s1;
    }
}
