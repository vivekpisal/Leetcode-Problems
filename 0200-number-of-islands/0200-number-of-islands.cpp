class Solution {
public:
    void countIsland(vector<vector<char>> grid,vector<vector<int>> &vis,int row,int col){
        queue<pair<int,int>> q;
        q.push({row,col});
        int n=grid.size();
        int m=grid[0].size();
        while(!q.empty()){
            int i=q.front().first;
            int j=q.front().second;
            q.pop();
            if(i < n && j+1 < m && grid[i][j+1] == '1' && vis[i][j+1] == 0){
                q.push({i,j+1});
                vis[i][j+1]=1;
            }
            if(i < n && j-1 >=0 && grid[i][j-1] == '1' && vis[i][j-1] == 0){
                q.push({i,j-1});
                vis[i][j-1]=1;
            }
            if(i-1 >=0 && j < m && grid[i-1][j] == '1' && vis[i-1][j] == 0){
                q.push({i-1,j});
                vis[i-1][j]=1;
            }
            if(i+1 < n && j < m && grid[i+1][j] == '1' && vis[i+1][j] == 0){
                q.push({i+1,j});
                vis[i+1][j]=1;
            }
            
        }
    }
    int numIslands(vector<vector<char>>& grid) {
        int n=grid.size();
        int m=grid[0].size();
        vector<vector<int>> vis(n,vector<int>(m,0));
        int island=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    island++;
                    countIsland(grid,vis,i,j);
                }
            }
        }
        return island;
    }
};