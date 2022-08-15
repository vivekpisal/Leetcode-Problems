class Solution {
public:
    void dfs(int i,int j,vector<vector<char>>& grid){
        if(i < 0 || j < 0 || i >= grid.size() || j >= grid[0].size() || grid[i][j] != '1')
            return;
        
        grid[i][j]='2';
        dfs(i,j+1,grid);
        dfs(i+1,j,grid);
        dfs(i,j-1,grid);
        dfs(i-1,j,grid);
    }
    int numIslands(vector<vector<char>>& grid) {
        int island=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == '1'){
                    island++;
                    dfs(i,j,grid);
                }
            }
        }
        return island;
    }
};