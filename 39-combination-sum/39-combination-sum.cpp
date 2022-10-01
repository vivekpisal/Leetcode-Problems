class Solution {
public:
    
    void Csum(vector<int>& arr,vector<vector<int>>& ans,vector<int>& ds,int tar,int i){        
        if(i == arr.size()){
            if(0 == tar){
                ans.push_back(ds);
            }
            return;
        }
        
        if(tar >= arr[i]){
            ds.push_back(arr[i]);
            Csum(arr,ans,ds,tar-arr[i],i);
            ds.pop_back();
        }
        
        Csum(arr,ans,ds,tar,i+1);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> ds;
        Csum(candidates,ans,ds,target,0);
        return ans;
    }
};