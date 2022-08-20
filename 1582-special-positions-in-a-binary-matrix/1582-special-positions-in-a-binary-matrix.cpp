class Solution {
public:
    int numSpecial(vector<vector<int>>& mat) {
        int no=0;
        for(int i=0;i<mat.size();i++){
            for(int j=0;j<mat[0].size();j++){
                if(mat[i][j] == 1){
                    int count=0;
                    for(int k=0;k<mat.size();k++){
                        if(mat[k][j] == 1)
                            count++;
                    }
                    if(count == 1){
                        for(int k=0;k<mat[0].size();k++){
                            if(mat[i][k] == 1)
                                count++;
                        }
                        if(count == 2)
                            no++;
                    }
                }
            }
        }
        return no;
    }
};