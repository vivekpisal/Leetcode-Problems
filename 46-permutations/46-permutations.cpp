class Solution {
public:
    void permutations(vector<int> nums,vector<vector<int>> &ans,int i){
        if(i == nums.size()){
            ans.push_back(nums);
            return;
        }
        
        for(int j=i;j<nums.size();j++){
            swap(nums[j],nums[i]);
            permutations(nums,ans,i+1);
            swap(nums[j],nums[i]);
        }
    }
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> ans;
        permutations(nums,ans,0);
        return ans;
    }
};