class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int sellPrice = prices[0];
        int profit = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
                sellPrice = prices[i];
            }
            if(sellPrice < prices[i]){
                sellPrice = prices[i];
            }
            profit = Math.max(profit,sellPrice - buyPrice);
        }
        return profit;
    }
}