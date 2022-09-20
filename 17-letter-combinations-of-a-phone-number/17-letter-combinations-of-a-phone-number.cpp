class Solution {
public:
    void letterCombination(string digits,vector<string> &keypad,vector<string> &ans,string asf,int i){
        if(i == digits.size()){
            ans.push_back(asf);
            return;
        }
        
        int digit=digits[i]-'0'-2;
        for(int j=0;j<keypad[digit].size();j++){
            letterCombination(digits,keypad,ans,asf+keypad[digit][j],i+1);
        }
    }
    vector<string> letterCombinations(string digits) {
        vector<string> ans;
        if(digits.size() == 0)
            {return ans;}
        vector<string> keypad={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        letterCombination(digits,keypad,ans,"",0);
        return ans;
    }
};