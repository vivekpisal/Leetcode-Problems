class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        unordered_map<char,char> mp,alph;
        for(int i=0;i<s.size();i++){
            if(alph.find(t[i]) != alph.end() && alph[t[i]] != s[i]){
                    return false;
            }
            
            if(mp.find(s[i]) != mp.end() && mp[s[i]] != t[i]){
                return false;
            }else{
                mp[s[i]]=t[i];
                alph[t[i]]=s[i];
            }
        }
        return true;
    }
};