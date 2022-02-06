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
for(int i=0;i<matrix.size();i++)
matrix[i][y]=0;
}
}
};
```
**Approach:-**
* The first store column element have 0 or not.
* The first column store the row element have 0 or not.
* But the element in first location (0,0) maps with both row and column that's why we take two variable **row** and **col** if the first column contain 0 then the **col** will true otherwise false same with **row** variable but in first row.
```
class Solution {
public:
void setZeroes(vector<vector<int>>& matrix) {
bool col=false,row=false;
for(int i=0;i<matrix.size();i++)
{
for(int j=0;j<matrix[0].size();j++)
{
if(matrix[i][j] == 0)
{
if(j == 0)
col=true;