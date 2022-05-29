class Solution {
public:
    void ff(vector<vector<int>> &image,int sr,int sc,int newc,int color){
        if(sr < 0 || sc < 0 || sr >= image.size() || sc >= image[0].size() || image[sr][sc] != color){
            return;
        }
        
        image[sr][sc]=newc;
        ff(image,sr+1,sc,newc,color);
        ff(image,sr-1,sc,newc,color);
        ff(image,sr,sc+1,newc,color);
        ff(image,sr,sc-1,newc,color);
    }
    
    
    
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)   return image;
        ff(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
};