class Solution {
public:
    vector<vector<int>> ans;
    void combinations(int startv,int n,int k,vector<int> &temp)
    {
        if(temp.size() == k)
        {
            ans.push_back(temp);
            return;
        }
        for(int i=startv;i<=n;i++)
        {
            temp.push_back(i);
            combinations(i+1,n,k,temp);
            temp.pop_back();
        }
    }
    vector<vector<int>> combine(int n, int k) {
        for(int i=1;i<=n-k+1;i++)
        {
            vector<int> temp;
            temp.push_back(i);
            combinations(i+1,n,k,temp);
        }
        return ans;
    }
};