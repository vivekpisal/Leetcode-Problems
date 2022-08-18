class Solution {
private:
    int rottOrange(queue<pair<pair<int,int>,int>>& q,vector<vector<int>>& grid){
        int time=0;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        while(!q.empty()){
            auto ro=q.front();
            q.pop();
            int sr=ro.first.first;
            int sc=ro.first.second;
            int prevtime=ro.second;
            for(int i=0;i<4;i++){
                int nrow=sr+delRow[i];
                int ncol=sc+delCol[i];
                if(nrow >= 0 && nrow < grid.size() && ncol >= 0 && ncol < grid[0].size() && grid[nrow][ncol] == 1){
                   grid[nrow][ncol]=2;
                    q.push({{nrow,ncol},prevtime+1});
                }
            }
            if(prevtime > time)
                time=prevtime;
        }
        return time;
    }    
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<pair<int,int>,int>> q;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == 2)
                    q.push({{i,j},0});
            }
        }
        int time=rottOrange(q,grid);
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == 1)
                    return -1;
            }
        }
        return time;
    }
};