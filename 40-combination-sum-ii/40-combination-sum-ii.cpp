class Solution {
public:
    
    void Csum2(vector<int> arr,int tar,vector<int>ds,vector<vector<int>>& ans,int i){
            if(tar == 0){
                ans.push_back(ds);
            }
        
        for(int j=i;j<arr.size();j++){
            if(arr[j] > tar) break;
            if(j>i && arr[j] == arr[j-1]) continue;
            
            ds.push_back(arr[j]);
            Csum2(arr,tar-arr[j],ds,ans,j+1);
            ds.pop_back();
        }
    }
    
    
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        
        sort(candidates.begin(),candidates.end());
        vector<int> ds;
        vector<vector<int>> ans;
        Csum2(candidates,target,ds,ans,0);
        return ans;
    }
};