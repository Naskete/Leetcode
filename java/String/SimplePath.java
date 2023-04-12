package String;

public class SimplePath {
    // 71. simplify path
    public boolean isValid(String s) {
        int length = s.length();
        int[] index = new int[(length + 1)/2];
        char singLast = s.charAt(length - 1);
        int counter = 0;
        if (length % 2 != 0) return false;
        if (singLast == '{' || singLast == '(' || singLast == '[') return false;
        
        for (int i = 0; i < length; i++) {
            char sign = s.charAt(i);
            if (sign == '{' || sign == '(' || sign == '[') {
                counter++;
                if(counter > length/2) return false;
                index[counter - 1] = i;
            } else if(counter != 0){
                char pastBracket = s.charAt(index[counter - 1]);
                if (!((pastBracket == (int) sign - 1) || (pastBracket == (int) sign - 2))) return false;
                counter--;
            } else {
                return false;
            }
        }
        return true;
    }
}
