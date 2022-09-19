class Solution {
public:
    void csum2(vector<int>&candidates,vector<vector<int>>& ans,vector<int> &asf,int target,int currInd){
        if(target == 0)
            ans.push_back(asf);
        
        
        for(int i=currInd;i<candidates.size();i++){
            if(i != currInd && candidates[i-1] == candidates[i])
                continue;
            
            if(target >= candidates[i]){
                asf.push_back(candidates[i]);
                csum2(candidates,ans,asf,target-candidates[i],i+1);
                asf.pop_back();
            }
        }
    }
    vector<vector<int>> combinationSum2(vector<int>& candidates, int target) {
        vector<vector<int>> ans;
        vector<int> asf;
        sort(candidates.begin(),candidates.end());
        csum2(candidates,ans,asf,target,0);
        return ans;
    }
};