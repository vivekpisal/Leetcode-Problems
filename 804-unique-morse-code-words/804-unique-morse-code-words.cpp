class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        vector<string> wtom={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        unordered_map<string,int> mp;
        for(int i=0;i<words.size();i++){
            string trans="";
            for(char i:words[i]){
                trans+=wtom[int(i-97)];
            }
            if(mp.find(trans) != mp.end())
                mp[trans]++;
            else
                mp[trans]=1;
        }
        return mp.size();
    }
};