class Solution {
public:
    void allPermutations(vector<vector<int>> &ans,unordered_map<int,bool> &mp,vector<int> &nums,vector<int> &ds,int i){
        if(i == nums.size()){
            ans.push_back(ds);
            return;
        }
        
        for(int ind=0;ind<nums.size();ind++){
            if(mp.find(nums[ind]) == mp.end()){
                mp[nums[ind]]=false;
            }
            if(mp[nums[ind]] == false){
                ds.push_back(nums[ind]);
                mp[nums[ind]]=true;
                allPermutations(ans,mp,nums,ds,i+1);
                ds.pop_back();
                mp[nums[ind]]=false;
            }
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        unordered_map<int,bool> mp;
        vector<vector<int>> ans;
        vector<int> ds;
        allPermutations(ans,mp,nums,ds,0);
        return ans;
    }
};