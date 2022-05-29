class Solution {
public:
    void ff(vector<vector<int>> &image,int sr,int sc,int newc,vector<vector<bool>> &mp,int color){
        if(sr < 0 || sc < 0 || sr >= image.size() || sc >= image[0].size() || image[sr][sc] != color || mp[sr][sc] == true){
            return;
        }
        
        image[sr][sc]=newc;
        mp[sr][sc]=true;
        ff(image,sr+1,sc,newc,mp,color);
        ff(image,sr-1,sc,newc,mp,color);
        ff(image,sr,sc+1,newc,mp,color);
        ff(image,sr,sc-1,newc,mp,color);
    }
    
    
    
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        vector<vector<bool>> mp(image.size(),vector<bool> (image[0].size(),false));
        ff(image,sr,sc,newColor,mp,image[sr][sc]);
        return image;
    }
};