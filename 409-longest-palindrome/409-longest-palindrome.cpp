class Solution {
public:
    int longestPalindrome(string s) {
        if(s.size() == 1 || s.size() == 0)
            return s.size();
        
        unordered_map<char,int> mp;
        for(char c:s){
            if(mp.find(c) != mp.end())
            {
                mp[c]++;
            }
            else{
                mp[c]=1;
            }
        }
        int p=0;
        for(auto &i:mp){
            p=p+(i.second-(i.second%2));
            mp[i.first]=i.second%2;
        }
        for(auto &i:mp){
            if(i.second == 1){
                p+=1;
                break;
            }
        }
        return p;
    }
};