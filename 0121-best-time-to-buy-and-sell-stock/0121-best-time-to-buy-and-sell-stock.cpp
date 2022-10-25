class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int maxProfit=0;
        int minEle=INT_MAX;
        for(int i=0;i<prices.size();i++){
            minEle=min(minEle,prices[i]);
            if(prices[i]-minEle > maxProfit)
                maxProfit=prices[i]-minEle;
        }
        return maxProfit;
    }
};