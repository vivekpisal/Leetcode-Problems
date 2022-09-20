class Solution {
public:
    void subset2(vector<int>& nums,vector<vector<int>>& ans,vector<int>&asf,int i){
        ans.push_back(asf);
        if(i == nums.size())
            return;
        
        for(int j=i;j<nums.size();j++){
            if(j != i && nums[j] == nums[j-1])
                continue;
            
            asf.push_back(nums[j]);
            subset2(nums,ans,asf,j+1);
            asf.pop_back();
        }
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> ans;
        vector<int> asf;
        sort(nums.begin(),nums.end());
        subset2(nums,ans,asf,0);
        return ans;
    }
};