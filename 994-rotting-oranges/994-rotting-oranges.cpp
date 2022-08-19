class Solution {
private:
    int rottOrange(queue<pair<pair<int,int>,int>>& q,vector<vector<int>>& grid,int orange){
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
                    orange--;
                    q.push({{nrow,ncol},prevtime+1});
                }
            }
            if(prevtime > time)
                time=prevtime;
        }
        if(orange != 0)
            return -1;
        return time;
    }    
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<pair<int,int>,int>> q;
        int orange=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == 2)
                    q.push({{i,j},0});
                else if(grid[i][j] == 1)
                    orange++;
            }
        }
        int time=rottOrange(q,grid,orange);
        return time;
    }
};