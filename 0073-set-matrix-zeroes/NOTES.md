**Approach:-**
1. Find the zeros store there location in queue.
2. while the queue is not become empty
* Run a loop from 0 to length of row and make row element as 0.
* Run a loop from 0 to matrix size and make column element as 0.
```
class Solution {
public:
void setZeroes(vector<vector<int>>& matrix) {
queue<pair<int,int>> q;
for(int i=0;i<matrix.size();i++)
{
for(int j=0;j<matrix[0].size();j++)
{
if(matrix[i][j] == 0)
q.push({i,j});
}
}
while(!q.empty())
{
auto curr=q.front();
int x=curr.first;
int y=curr.second;
q.pop();
for(int i=0;i<matrix[0].size();i++)
matrix[x][i]=0;