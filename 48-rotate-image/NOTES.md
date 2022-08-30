```
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
```
​
```
void rotate(vector<vector<int>>& matrix) {
int n=matrix.size();
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
swap(matrix[i][j],matrix[j][i]);
}
}
for(int row=0;row<n;row++){
reverse(matrix[row].begin(),matrix[row].end());
}
}
```