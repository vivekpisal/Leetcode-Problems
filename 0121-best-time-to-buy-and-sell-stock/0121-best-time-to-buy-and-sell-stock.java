class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0],min=prices[0],profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i] < min){
                min=prices[i];
                max=prices[i];
            }
            else if(prices[i] > max){
                max=prices[i];
                profit=Math.max(max-min,profit);
            }
        }
        return profit;
    }
}