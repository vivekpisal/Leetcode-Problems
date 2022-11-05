//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
  private:
    bool detect(vector<int> adj[],int vis[],int V,int start){
        stack<pair<int,int>> st;
        st.push({start,start});
        vis[start]=1;
        while(!st.empty()){
            int node=st.top().first;
            int pnode=st.top().second;
            st.pop();
            for(int adjnode:adj[node]){
                if(vis[adjnode] == 0){
                    st.push({adjnode,node});
                    vis[adjnode]=1;
                }
                else{
                    if(adjnode != pnode)
                        return true;
                }
            }
        }
        return false;
    }  
  public:
    bool isCycle(int V, vector<int> adj[]) {
        int vis[V]={0};
        for(int i=0;i<V;i++){
            if(vis[i] != 1)
                if(detect(adj,vis,V,i))
                    return true;
        }
        return false;
    }
};

//{ Driver Code Starts.
int main() {
    int tc;
    cin >> tc;
    while (tc--) {
        int V, E;
        cin >> V >> E;
        vector<int> adj[V];
        for (int i = 0; i < E; i++) {
            int u, v;
            cin >> u >> v;
            adj[u].push_back(v);
            adj[v].push_back(u);
        }
        Solution obj;
        bool ans = obj.isCycle(V, adj);
        if (ans)
            cout << "1\n";
        else
            cout << "0\n";
    }
    return 0;
}
// } Driver Code Ends