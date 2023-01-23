package Array;

// 2303. https://leetcode.cn/problems/calculate-amount-paid-in-taxes/
public class Taxes {
    public double calculateTax(int[][] brackets, int income) {
        if (income < brackets[0][0]) {
            return income * brackets[0][1]*1.0/100;
        }
        double tax = brackets[0][0]*brackets[0][1]*1.0/100;
        for (int i = 1; i < brackets.length; i++) {
            double upper = brackets[i][0], percent = brackets[i][1]*1.0 / 100;
            if (upper < income) {
                tax += (upper - brackets[i - 1][0]) * percent;
            } else {
                tax += (income - brackets[i - 1][0]) * percent;
                break;
            }
        }
        return tax;
    }
}
