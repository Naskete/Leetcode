package Number;

// 258. add digits
public class AddDigit {
    public int addDigits(int num) {
        if (num < 10) return num;
        while (num >= 10) {
            int res = 0;
            while(num > 0) {
                int mod = num % 10;
                res += mod;
                num = num / 10;
            }
            num = res;
        }
        return num;
    }
}
