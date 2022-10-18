class Solution {
public:
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>> pascal={{1}};
        for(int i=1;i<numRows;i++){
            vector<int> row;
            row.push_back(1);
            for(int j=0;j<pascal[i-1].size()-1;j++){
                row.push_back(pascal[i-1][j] + pascal[i-1][j+1]);
            }
            row.push_back(1);
            pascal.push_back(row);
        }
        return pascal;
    }
};