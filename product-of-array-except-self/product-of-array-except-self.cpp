class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> product(nums.size());
        int allprod=1;
        for(int i=0;i<nums.size();i++)
        {
            allprod*=nums[i];
        }
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i] == 0)
            {
                int prod=1;
                for(int j=0;j<nums.size();j++)
                {
                    if(j != i)
                        prod*=nums[j];
                }
                product[i]=prod;
            }
            else
                product[i]=allprod/nums[i];
        }
        return product;
    }
};