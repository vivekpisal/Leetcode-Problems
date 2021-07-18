class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size())
            return false;
        
        unordered_map<char,char> mp;
        int alph[256]={};
        for(int i=0;i<s.size();i++)
        {
            if(mp.find(s[i]) == mp.end() && alph[t[i]] == 0)
            {
                mp[s[i]] = t[i];
                alph[t[i]]=1;
            }
            else if(mp.find(s[i]) != mp.end() && alph[t[i]] == 1 && t[i] == mp[s[i]])
            {
                
            }
            else
            {
                return false;
            }
        }
        return true;
    }
};