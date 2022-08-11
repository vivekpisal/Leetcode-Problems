}
bool sudokuSolve(vector<vector<char>>& board){
for(int i=0;i<board.size();i++)
{
for(int j=0;j<board[i].size();j++)
{
if(board[i][j] == '.')
{
for(char no='1';no<='9';no++)
{
if(can_put(board,i,j,no))
{
board[i][j]=no;
if(sudokuSolve(board))
return true;
else
board[i][j]='.';
}
}
return false;
}
}
}
return true;
}
void solveSudoku(vector<vector<char>>& board) {
sudokuSolve(board);
}
};
```
​
Runtime:- 24ms
```
class Solution {
public:
bool solve(vector<vector<char>>& board,int i,int j)
{
if(i == board.size())
return true;
int ni,nj;
if(j == board[0].size()-1)
{
ni=i+1;
nj=0;
}
else
{
ni=i;
nj=j+1;