class Solution {
private:
    void dfs(vector<vector<int>> &image,int sr,int sc,int delRow[],int delCol[],int color,int oldColor)
    {
        int n=image.size();
        int m=image[0].size();
        image[sr][sc]=color;
        for(int i=0;i<4;i++){
            int nrow=sr + delRow[i];
            int ncol=sc + delCol[i];
            if(nrow >= 0 && nrow < n && ncol>= 0 && ncol < m && image[nrow][ncol] == oldColor){
                dfs(image,nrow,ncol,delRow,delCol,color,oldColor);
            }
        }
    }
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color)     {
        if(image[sr][sc] == color)
            return image;
        int delRow[]={-1,0,1,0};
        int delCol[]={0,1,0,-1};
        int oldColor=image[sr][sc];
        //vector<vector<bool>> vis(image.size(),vector<bool> (image[0].size(),false));
        dfs(image,sr,sc,delRow,delCol,color,oldColor);
        return image;
    }
};