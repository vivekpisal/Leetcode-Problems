class Solution {
public:
    void uniqueComb(vector<vector<int>> &ans,vector<int> arr,vector<int>& ds,int tar,int i){
        if(tar == 0){
            ans.push_back(ds);
            return;
        }
        if(i == arr.size()) return;
        
        for(int ind=i;ind<arr.size();ind++){
            if(arr[i] > tar) return;
            
            if(i != ind && arr[ind] == arr[ind-1])
                continue;
            
            ds.push_back(arr[ind]);
            uniqueComb(ans,arr,ds,tar-arr[ind],ind+1);
            ds.pop_back();
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<int> ds;
        vector<vector<int>> ans;
        sort(candidates.begin(),candidates.end());
        uniqueComb(ans,candidates,ds,target,0);
        return ans;
    }
};