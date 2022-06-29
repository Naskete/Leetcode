package middle;

public class Reverse {
    public int reverse(int x) {
        int res = 0, y;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while (x != 0) {
            y = x%10;
            x = x/10;
            if ((res > max / 10 || (res == max/10 && y > max % 10)) ||
                    (res < min / 10 || res == min / 10 && y < min % 10)) {
                return 0;
            }
            res = res * 10 + y;
        }
        return res;
    }
}
