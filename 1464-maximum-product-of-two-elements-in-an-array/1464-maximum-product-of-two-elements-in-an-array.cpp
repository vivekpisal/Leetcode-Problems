class Solution {
public:
    int maxProduct(vector<int>& nums) {
        priority_queue<int,vector<int>,greater<int>> minH;
        for(int i:nums){
            minH.push(i);
            if(minH.size() > 2)
                minH.pop();
        }
        int fgrt=minH.top();
        minH.pop();
        int sgrt=minH.top();
        return (fgrt-1) * (sgrt-1);
    }
};