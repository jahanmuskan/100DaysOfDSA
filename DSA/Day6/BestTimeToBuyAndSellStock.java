package DSA.Day6;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // Update minimum price if a lower price is found
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // Calculate profit and update maxProfit if it's higher
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};  // Expected output: 5
        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};    // Expected output: 0

        // Print results
        System.out.println("Max Profit (Test Case 1): " + solution.maxProfit(prices1));
        System.out.println("Max Profit (Test Case 2): " + solution.maxProfit(prices2));
    }
}

