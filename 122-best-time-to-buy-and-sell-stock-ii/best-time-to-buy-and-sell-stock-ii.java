class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
         for (int i = 1, prev = prices[0]; i < prices.length; i++) {
            int curr = prices[i];
            if (curr > prev) profit += curr - prev;
            prev = curr; 
        }
        return profit;
    }
}