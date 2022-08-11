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
    void paliPartition(string s,vector<string>& atn,vector<vector<string>>& ans)
    {
        if(s.size() == 0){
            ans.push_back(atn);
            return;
        }
        
        for(int j=0;j<s.size();j++){
            string sub=s.substr(0,j+1);
            if(check_pali(sub)){
                atn.push_back(sub);
                s.erase(0,j+1);
                paliPartition(s,atn,ans);
                atn.pop_back();
                s.insert(0,sub);
            }
        }
    }
    
    vector<vector<string>> partition(string s) {
        vector<vector<string>> ans;
        vector<string> atn;
        paliPartition(s,atn,ans);
        return ans;
    }
};