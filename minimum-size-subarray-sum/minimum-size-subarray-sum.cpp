class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int size=INT_MAX;
        for(int i=0;i<nums.size();i++)
        {
            int sum=0;
            for(int j=i;j<nums.size();j++)
            {
                sum+=nums[j];
                if(sum >= target && size > j-i+1)
                {
                    size=(j-i)+1;
                    break;
                }
            }
        }
        if(size == INT_MAX)
            return 0;
        return size;
    }
};