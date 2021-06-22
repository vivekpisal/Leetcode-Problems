class Solution {
public:
    bool buddyStrings(string s, string goal) {
        if(s.size() != goal.size())
            return false;
        else if(s == goal)
        {
            unordered_map<char,int> mp;
            for(char t:s)
            {
                if(mp.find(t)!=mp.end())
                    return true;
                else
                    mp[t]=1;
            }
            return false;
        }
        else
        {
            int f=-1,sec=-1;
            for(int i=0;i<s.size();i++)
            {
                if(s[i]!=goal[i])
                {
                    if(f == -1)
                        f=i;
                    else
                        sec=i;
                }
            }
            if(sec != -1)
                swap(s[f],s[sec]);
            if(s == goal)
                return true;
            else
                return false;
        }
    }
};