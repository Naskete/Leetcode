package Array;

public class EatBanana {
    // 875 https://leetcode.com/problems/koko-eating-bananas
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for (int pile : piles) {
            high = Math.max(pile, high);
        }
        int ans = high;
        while (low < high) {
            int speed = (high - low) / 2 + low;
            int t = getTime(piles, speed);
            if (t <= h) {
                ans = speed;
                high = speed;
            } else {
                low = speed + 1;
            }
        }
        return ans;
    }

    public int getTime(int[] piles, int speed) {
        int time = 0;
        for (int pile : piles) {
            time += ((pile + speed - 1) / speed);
        }
        return time;
    }
}
