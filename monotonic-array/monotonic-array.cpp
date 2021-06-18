class Solution {
public:
    bool isMonotonic(vector<int>& nums) {
        bool ans=true;
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums[i+1] >= nums[i])
                ans=true;
            else
            {
                ans=false;
                break;
            }
        }
        if(ans)
            return ans;
        for(int i=0;i<nums.size()-1;i++)
        {
            if(nums[i+1] <= nums[i])
                ans=true;
            else
            {
                ans=false;
                break;
            }
        }
        return ans;
    }
};