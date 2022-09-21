class Solution {
public:
    bool check_pali(string s){
        int i=0,j=s.size()-1;
        while(j >= i){
            if(s[i++] != s[j--]){
                return false;
            }
        }
        return true;
    }
    void paliPartition(string s,vector<string>& atn,vector<vector<string>>& ans,int brkstr)
    {
        if(s.size() == brkstr){
            ans.push_back(atn);
            return;
        }
        
        for(int j=brkstr;j<s.size();j++){
            string sub=s.substr(brkstr,j - brkstr+1);
            if(check_pali(sub)){
                atn.push_back(sub);
                paliPartition(s,atn,ans,j+1);
                atn.pop_back();
            }
        }
    }
    
    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> atn;
        paliPartition(s,atn,ans,0);
        return ans;
    }
};