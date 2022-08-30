class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        vector<vector<int>> ans=matrix;
        int col=matrix[0].size()-1;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size();){
                for(int row=0;row<matrix.size();row++){
                    matrix[row][col]=ans[i][j];
                    j++;
                }
                col--;
            }
        }
    }
};