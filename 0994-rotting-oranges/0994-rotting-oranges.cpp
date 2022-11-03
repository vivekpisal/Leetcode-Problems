class Solution {
private:
    int RoteOrange(vector<vector<int>> &grid,queue<pair<pair<int,int>,int>> &q,int orange){
        int time=0;
        int n=grid.size();
        int m=grid[0].size(); 
        while(!q.empty()){
            auto curr=q.front();
            q.pop();
            int row=curr.first.first,col=curr.first.second;
            int prevT=curr.second;
            int coordinate[]={0,1,0,-1,0};
            for(int i=0;i<4;i++){
                int drow=row+coordinate[i],dcol=col+coordinate[i+1];
                if(drow < n && drow >=0 && dcol < m && dcol >= 0 && grid[drow][dcol] == 1){
                    grid[drow][dcol]=2;
                    orange--;
                    q.push({{drow,dcol},prevT+1});
                }
            }
            if(prevT > time)
                time=prevT;
        }
        if(orange == 0)
            return time;
        return -1;
    }
public:
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<pair<int,int>,int>> q;
        int orange=0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[i].size();j++){
                if(grid[i][j] == 1)
                    orange++;
                else if(grid[i][j] == 2)
                    q.push({{i,j},0});
            }
        }
        int time=RoteOrange(grid,q,orange);
        return time;
    }
};