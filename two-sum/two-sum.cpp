class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,pair<int,int>> mp;
        vector<int> ans;
        for(int i=0;i<nums.size();i++){
            if(mp.find(nums[i])!=mp.end())
            {
                mp[nums[i]].first++;
                mp[nums[i]].second=i;
            }
            else
            {
                mp[nums[i]]={1,i};
            }
        }
        for(int i=0;i<nums.size();i++)
        {
            if(mp.find(target-nums[i])!=mp.end())
            {
                auto curr = mp[target-nums[i]];
                if(curr.second!=i)
                {
                    ans.push_back(i);
                    ans.push_back(curr.second);
                    break;
                }
            }
        }
        return ans;
    }
};