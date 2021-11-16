class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        vector<vector<int>> ans=matrix;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size();j++){
                if(matrix[i][j] == 0){
                    for(int l=0;l<matrix.size();l++){
                        ans[l][j]=0;
                    }
                    for(int l=0;l<matrix[0].size();l++){
                        ans[i][l]=0;
                    }
                }
            }
        }
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[0].size();j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
};