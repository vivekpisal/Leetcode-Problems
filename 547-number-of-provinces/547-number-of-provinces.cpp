class Solution {
public:
    void bfs(int ele,vector<vector<int>>& adj,vector<bool>& vis){
        queue<int> q;
        q.push(ele);
        while(!q.empty()){
            int top=q.front();
            q.pop();
            for(int i=0;i<adj[top-1].size();i++){
                if(adj[top-1][i] == 1 && vis[i+1] == false){
                    vis[i+1]=true;
                    q.push(i+1);
                }
            }
        }
    }
    
    int findCircleNum(vector<vector<int>>& isConnected) {
        vector<bool> vis(isConnected.size()+1,false);
        int pro=0;
        for(int i=1;i<=isConnected.size();i++){
            if(!vis[i]){
                vis[i]=true;
                pro++;
                bfs(i,isConnected,vis);
            }
        }
        return pro;
    }
};