class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s == "" && goal == "")
            return true;
        for(int i=0;i<s.size();i++){
            if(s == goal) 
                return true;
            char firstL=s[0];
            s.erase(s.begin()+0);
            s+=firstL;
        }
        return false;
    }
};