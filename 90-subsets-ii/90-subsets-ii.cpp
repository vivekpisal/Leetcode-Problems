class Solution {
public:
    void subset2(vector<int> &nums,vector<int> asf,int i,set<vector<int>> &uniqueAns){
        if(i == nums.size()){
            sort(asf.begin(),asf.end());
            uniqueAns.insert(asf);
            return;
        }
        
        asf.push_back(nums[i]);
        subset2(nums,asf,i+1,uniqueAns);
        asf.pop_back();
        subset2(nums,asf,i+1,uniqueAns);  
    }
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<int> asf;
        set<vector<int>> uniqueAns;
        subset2(nums,asf,0,uniqueAns);
        vector<vector<int>> ans;
        for(auto &i:uniqueAns)
            ans.push_back(i);
        return ans;
    }
};