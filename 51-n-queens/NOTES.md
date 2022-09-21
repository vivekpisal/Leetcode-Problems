}
return true;
}
void n_queen(vector<string> &board,vector<vector<string>>& ans,int col,int n){
if(col == n){
ans.push_back(board);
return;
}
for(int row=0;row<n;row++){
if(isSafe(row,col,board,n)){
board[row][col]='Q';
n_queen(board,ans,col+1,n);
board[row][col]='.';
}
}
}
vector<vector<string>> solveNQueens(int n) {
vector<vector<string>> ans;
vector<string> board(n);
string str(n,'.');
for(int i=0;i<n;i++){
board[i]=str;
}
n_queen(board,ans,0,n);
return ans;
}
};
```