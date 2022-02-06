class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n=matrix.size(),m=matrix[0].size();
        vector<int> r(n,1),c(m,1);
        for(int i=0;i<matrix.size();i++){
            for(int j=0;j<matrix[i].size();j++){
                if(matrix[i][j] == 0){
                    r[i]=0;
                    c[j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(r[i] == 0){
                for(int j=0;j<m;j++){
                    matrix[i][j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(c[i] == 0){
                for(int j=0;j<n;j++){
                    matrix[j][i]=0;
                }
            }
        }
    }
};