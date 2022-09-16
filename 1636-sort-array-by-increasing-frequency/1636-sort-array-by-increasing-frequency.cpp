class Solution {
private:
    struct compare{
        bool operator()(pair<int,int> p1,pair<int,int> p2){
            if(p1.first > p2.first) return true;
            if(p1.first < p2.first) return false;
            if(p1.second > p2.second) 
                return false;
            return true;
        }
    };
public:
    vector<int> frequencySort(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums.size();i++){
            if(mp.find(nums[i]) != mp.end())
                mp[nums[i]]++;
            else
                mp[nums[i]]=1;
        }
        priority_queue<pair<int,int>,vector<pair<int,int>>,compare> minH;
        for(auto i:mp){
            minH.push({i.second,i.first});
        }
        nums.clear();
        while(!minH.empty()){
            auto ele=minH.top();
            minH.pop();
            for(int i=0;i<ele.first;i++){
                nums.push_back(ele.second);
            }
        }
        return nums;
    }
};