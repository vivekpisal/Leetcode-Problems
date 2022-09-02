class Solution {
public:
    string makeFancyString(string s) {
        if(s.size() < 3)
            return s;
        string ans="";
        for(int i=0;i<s.size();i++){
            if(i+1 < s.size() && i+2 < s.size() && s[i] == s[i+1] && s[i+1] == s[i+2])
            {}
            else
                ans+=s[i];
        }
        return ans;
    }
};