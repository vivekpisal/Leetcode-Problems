class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        if(matrix.size() == 0)
            return;
        
        vector<pair<int,int>> zeros;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[i].size();j++){
                if(matrix[i][j] == 0){
                    zeros.push_back({i,j});
                }
            }
        }
        for(auto &p:zeros){
            for(int i=0;i<matrix.size();i++){
                matrix[i][p.second]=0;
            }
            for(int i=0;i<matrix[0].size();i++){
                matrix[p.first][i]=0;
            }
        }
    }
};