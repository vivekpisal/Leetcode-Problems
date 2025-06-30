class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0],profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min=prices[i];
            }
            else if(prices[i]-min > profit){
                profit = prices[i]-min;
            }
        }
        return profit;
    }
}