
class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        queue<pair<int,int>> q;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[i].size();j++){
                if(matrix[i][j] == 0)
                    q.push({i,j});
            }
        }
        while(!q.empty()){
            int row=q.front().first;
            int col=q.front().second;
            q.pop();
            for(int coli=0;coli<matrix[0].size();coli++){
                matrix[row][coli]=0;
            }
            for(int rowi=0;rowi<matrix.size();rowi++){
                matrix[rowi][col]=0;
            }
        }
    }
};