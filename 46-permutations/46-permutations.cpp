class Solution {
public:
    vector<vector<int>> ans;
    void permutation(vector<int> &nums,vector<int> &asf,vector<int>& mp){
        if(asf.size() == nums.size()){
            ans.push_back(asf);
            return;
        }
        
        for(int i=0;i<nums.size();i++){
            if(mp[i] == 0){
                mp[i]=1;
                asf.push_back(nums[i]);
                permutation(nums,asf,mp);
                asf.pop_back();
                mp[i]=0;
            }
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<int> asf,mp(nums.size(),0);
        permutation(nums,asf,mp);
        return ans;
    }
};