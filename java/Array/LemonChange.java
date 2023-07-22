package Array;

public class LemonChange {
    public boolean lemonadeChange(int[] bills) {
        int[] changes = new int[3];
        if (bills[0] > 5) return false;
        int n = bills.length;
        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                changes[0]++;
                continue;
            } else if (bills[i] == 10) {
                if (changes[0] == 0) {
                    return false;
                }
                changes[1]++;
                changes[0]--;
            } else if (bills[i] == 20) {
                if (changes[0] >= 1 && changes[1] >= 1) {
                    changes[0]--;
                    changes[1]--;
                } else if (changes[0] >= 3) {
                    changes[0]-= 3;
                } else {
                    return false;
                }
                changes[2]++;
            }
        }
        return true;
    }
}
