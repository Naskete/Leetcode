package middle;

// https://leetcode.cn/problems/determine-color-of-a-chessboard-square/
public class Color {
    public boolean squareIsWhite(String coordinates) {
        if((coordinates.charAt(0)-'a')%2==0) {
            if((coordinates.charAt(1)-'1')%2==1) {
                return true;
            }
        }
        if((coordinates.charAt(0)-'a')%2==1) {
            if((coordinates.charAt(1)-'1')%2==0) {
                return true;
            }
        }
        return false;
    }
}
