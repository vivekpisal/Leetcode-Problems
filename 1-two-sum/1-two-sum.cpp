class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            mp[nums[i]]=i;
        }
        for(int i=0;i<nums.size();i++){
            int ele=target-nums[i];
            if(mp.find(ele) != mp.end()){
                if(i != mp[ele]){
                    vector<int> ans={i,mp[ele]};
                    return ans;
                }
            }
        }
        vector<int> ans;
        return ans;
    }
};