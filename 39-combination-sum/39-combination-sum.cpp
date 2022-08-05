class Solution {
public:
    vector<vector<int>> ans;
    void Csum(vector<int>& arr,vector<int>& ds,int tar,int i,int asf){
        if(asf > tar) return;
        if(i == arr.size()){
            if(asf == tar){
                ans.push_back(ds);
            }
            return;
        }
        
        ds.push_back(arr[i]);
        asf+=arr[i];
        
        Csum(arr,ds,tar,i,asf);
        
        ds.pop_back();
        asf-=arr[i];
        
        Csum(arr,ds,tar,i+1,asf);
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        
        vector<int> ds;
        Csum(candidates,ds,target,0,0);
        return ans;
    }
};