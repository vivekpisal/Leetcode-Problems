class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if(strs.size() == 1)
            return strs[0];
        
        int i=0;
        bool f=true;
        for(i=0;i<strs[0].size();i++)
        {
            for(int j=0;j<strs.size();j++)
            {
                if(strs[0][i] != strs[j][i])
                {f=false;  break;}
            }
            if(!f)
                break;
        }
        return strs[0].substr(0,i);
    }
};