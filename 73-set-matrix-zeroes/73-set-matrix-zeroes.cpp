
class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        vector<vector<int>> mat=matrix;
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[i].size();j++){
                
                if(matrix[i][j] == 0){
                    for(int k=0;k<matrix[i].size();k++){
                        mat[i][k]=0;
                    }
                    for(int l=0;l<matrix.size();l++){
                        mat[l][j]=0;
                    }
                }  
            } 
        }
        matrix=mat;
    }
};