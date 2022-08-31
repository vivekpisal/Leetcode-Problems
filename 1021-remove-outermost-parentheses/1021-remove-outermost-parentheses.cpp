class Solution {
public:
    string removeOuterParentheses(string s) {
        int bracket=0;
        for(int i=0;i<s.size();){
            if(s[i] == '('){
                if(bracket == 0)
                    s.erase(s.begin()+i);
                else
                    i++;
                bracket++;
            }
            else{
                bracket--;
                if(bracket == 0)   
                    s.erase(s.begin()+i);
                else
                    i++;
            }
        }
        return s;
    }
};