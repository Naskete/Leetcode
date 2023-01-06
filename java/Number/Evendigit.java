package Number;

// 2180. https://leetcode.cn/problems/count-integers-with-even-digit-sum/
public class Evendigit {
    public int countEven(int num) {
        int res = 0;
        for (int i = 1; i <= num; i++) {
            if (even(i)) {
                res++;
            }
        }
        return res;
    }

    public boolean even(int num) {
        int res = 0;
        while(num > 0) {
            res += num % 10;
            num = num / 10;
        }
        return res % 2 == 0;
    }
}
