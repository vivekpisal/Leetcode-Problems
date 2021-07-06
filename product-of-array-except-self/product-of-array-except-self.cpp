class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> product(nums.size());
        int prod=1;
        for(int i=0;i<nums.size();i++)
        {
            product[i]=prod;
            prod=prod*nums[i];
        }
        prod=1;
        for(int i=nums.size()-1;i>=0;i--)
        {
            product[i]=product[i]*prod;
            prod=prod*nums[i];
        }
        return product;
    }
};