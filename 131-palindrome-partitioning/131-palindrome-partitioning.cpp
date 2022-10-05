class Solution {
public:
    bool checkPali(string str,int i,int j){
        while(i < j){
            if(str[i] != str[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    void makePartition(string s,vector<vector<string>>& ans,vector<string>& ds,int i){
        if(i == s.size()){
            ans.push_back(ds);
            return;
        }
        
        for(int j=i;j<s.size();j++){
            if(checkPali(s,i,j)){
                ds.push_back(s.substr(i,j-i+1));
                makePartition(s,ans,ds,j+1);
                ds.pop_back();
            }
        }
    }
    vector<vector<string>> partition(string s) {
        vector<string> ds;
        vector<vector<string>> ans;
        makePartition(s,ans,ds,0);
        return ans;
    }
};