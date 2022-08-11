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
}
if(board[i][j]!='.')
return solve(board,ni,nj);
else
{
for(int po=1;po<=9;po++)
{
if(valid(board,i,j,po) == true)
{
board[i][j]=po+'0';
if(solve(board,ni,nj))
return true;
else
board[i][j]='.';
}
}
}
return false;
}
bool valid(vector<vector<char>> &board,int x,int y,int po)
{
for(int i=0;i<board[0].size();i++)
{
if(board[x][i]-'0' == po)
return false;
}
for(int i=0;i<board.size();i++)
{
if(board[i][y]-'0' == po)
return false;
}
x=3*(x/3);
y=3*(y/3);