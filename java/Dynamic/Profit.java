package Dynamic;

public class Profit {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int cost = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            cost = Math.min(cost, prices[i]);
            profit = Math.max(profit, prices[i] - cost);
        }
        return profit;
    }
}
