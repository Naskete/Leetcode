package String;
public class ReverseWord {
    public static String reverseWord(String s) {
        StringBuilder stringBuffer = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = strings.length -1; i>=0; i--) {
            if(!strings[i].equals("")){
                stringBuffer.append(strings[i]).append(" ");
            }
        }
        return stringBuffer.toString().trim();
    }
}
