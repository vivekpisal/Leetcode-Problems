class Solution {
public:
    vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
        priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>> maxH;
        for(int i=0;i<mat.size();i++){
            int soldier=0;
            for(int j=0;j<mat[i].size();j++){
                if(mat[i][j] == 1)
                    soldier++;
                else break;
            }
            maxH.push({soldier,i});
        }
        vector<int> kWeak;
        while(k > 0){
            pair<int,int> t=maxH.top();
            maxH.pop();
            kWeak.push_back(t.second);
            k--;
        }
        return kWeak;
    }
};