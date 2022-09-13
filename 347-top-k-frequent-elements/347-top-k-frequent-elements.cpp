class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> minH;
        for(int i=0;i<nums.size();i++){
            if(mp.find(nums[i]) != mp.end())
                mp[nums[i]]++;
            else
                mp[nums[i]]=1;
        }
        for(auto i:mp){
            minH.push({i.second,i.first});
            if(minH.size() > k){
                minH.pop();
            }
        }
        vector<int> ans;
        while(minH.size() > 0){
            ans.push_back(minH.top().second);
            minH.pop();
        }
        return ans;
    }
};