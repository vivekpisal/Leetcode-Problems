class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color)     {
        queue<pair<int,int>> q;
        q.push({sr,sc});
        int n=image.size();
        int m=image[0].size();
        vector<vector<bool>> vis(n,vector<bool>(m,false));
        int oldC=image[sr][sc];
        vis[sr][sc]=true;
        while(!q.empty()){
            int row=q.front().first;
            int col=q.front().second;
            q.pop();
            if(col+1 < m && image[row][col+1] == oldC && vis[row][col+1] == false)
                {q.push({row,col+1});vis[row][col+1]=true;}
            
            if(col-1 >= 0 && image[row][col-1] == oldC && vis[row][col-1] == false)
                {q.push({row,col-1});vis[row][col-1]=true;}
            
            if(row + 1 < n && image[row+1][col] == oldC && vis[row+1][col] == false)
                {q.push({row+1,col});vis[row+1][col]=true;}
            
            if(row-1 >= 0 && image[row-1][col] == oldC && vis[row-1][col] == false)
                {q.push({row-1,col});vis[row-1][col]=true;}
            
            image[row][col]=color;
        }
        return image;
    }
};