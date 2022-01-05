class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> pascal={{1}};
        if(numRows == 1) return pascal;
        
        for(int i=0;i<numRows-1;i++){
            vector<int> temp={1};
            int prevrow=pascal[i].size()-1;
            for(int j=0;j<prevrow;j++){
                temp.push_back(pascal[i][j] + pascal[i][j+1]);
            }
            temp.push_back(1);
            pascal.push_back(temp);
        }
        return pascal;
    }
};