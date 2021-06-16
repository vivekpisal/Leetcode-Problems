class Solution {
public:
    string destCity(vector<vector<string>>& paths) {
        unordered_map<string,int> mp;
        for(int i=0;i<paths.size();i++)
        {
            mp[paths[i][0]]=i;
        }
        string ser=paths[0][1];
        while(mp.find(ser)!=mp.end())
        {
            int index=mp[ser];
            ser=paths[index][1];
        }
        return ser;
    }
};