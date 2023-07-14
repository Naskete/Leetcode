package Number;

public class AlterNatingSum {
    public int alternateDigitSum(int n) {
        String num = String.valueOf(n);
        int sum = 0, flag = 1;
        int len = num.length();
        for (int i = 0; i < len; i++) {
            sum += (num.charAt(i) - 48) * flag;
            flag = -flag;
        }
        return sum;
    }
}
