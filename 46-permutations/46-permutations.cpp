class Solution {
public:
    void permutations(vector<int> nums,vector<int>& ds,vector<bool>& mp,vector<vector<int>> &ans){
        if(ds.size() == nums.size()){
            ans.push_back(ds);
            return;
        }
        
        for(int i=0;i<nums.size();i++){
            if(mp[i] != true){
                ds.push_back(nums[i]);
                mp[i]=true;
                permutations(nums,ds,mp,ans);
                ds.pop_back();
                mp[i]=false;
            }    
        }
    }
    
    
    vector<vector<int>> permute(vector<int>& nums) {
        vector<bool> mp(nums.size(),false);
        vector<vector<int>> ans;
        vector<int> ds;
        permutations(nums,ds,mp,ans);
        return ans;
    }
};