class Solution {
public:
    vector<vector<int>> ans;
    void Csum(vector<int>& arr,vector<int>& ds,int tar,int i){
        if(tar < 0)
            return;
        
        if(i == arr.size()){
            if(0 == tar){
                ans.push_back(ds);
            }
            return;
        }
        

        ds.push_back(arr[i]);
        Csum(arr,ds,tar-arr[i],i);
        ds.pop_back();
        
        Csum(arr,ds,tar,i+1);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        
        vector<int> ds;
        Csum(candidates,ds,target,0);
        return ans;
    }
};