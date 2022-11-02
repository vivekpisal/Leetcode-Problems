//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        int offset[]={0,1,0,-1,0};
        int oldc=image[sr][sc];
        int n=image.size();
        int m=image[0].size();
        vector<vector<bool>> vis(n,vector<bool>(m,false));
        queue<pair<int,int>> q;
        q.push({sr,sc});
        image[sr][sc]=newColor;
        vis[sr][sc]=true;
        while(!q.empty()){
            int i=q.front().first;
            int j=q.front().second;
            q.pop();
            for(int p=0;p<4;p++){
                int drow=i+offset[p];
                int dcol=j+offset[p+1];
                if(drow < n && drow >= 0 && dcol < m && dcol >= 0 && image[drow][dcol] == oldc && vis[drow][dcol] == false){
                    image[drow][dcol]=newColor;
                    vis[drow][dcol]=true;
                    q.push({drow,dcol});
                }
            }
        }
        return image;
    }
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n, m;
		cin >> n >> m;
		vector<vector<int>>image(n, vector<int>(m,0));
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				cin >> image[i][j];
		}
		int sr, sc, newColor;
		cin >> sr >> sc >> newColor;
		Solution obj;
		vector<vector<int>> ans = obj.floodFill(image, sr, sc, newColor);
		for(auto i: ans){
			for(auto j: i)
				cout << j << " ";
			cout << "\n";
		}
	}
	return 0;
}
// } Driver Code Ends