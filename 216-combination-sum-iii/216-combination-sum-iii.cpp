class Solution {
public:
    void csum3(vector<vector<int>> &ans,vector<int> &asf,int i,int k,int n){
        if(i == 10)
        {
            if(n == 0 && k == 0)
                {ans.push_back(asf);}
            return;
        }
        
        if(i <= n){
            asf.push_back(i);
            csum3(ans,asf,i+1,k-1,n-i);
            asf.pop_back();
        }
        
        csum3(ans,asf,i+1,k,n);
    }
    vector<vector<int>> combinationSum3(int k, int n) {
        vector<vector<int>> ans;
        vector<int> asf;
        int i=1;
        csum3(ans,asf,i,k,n);
        return ans;
    }
};