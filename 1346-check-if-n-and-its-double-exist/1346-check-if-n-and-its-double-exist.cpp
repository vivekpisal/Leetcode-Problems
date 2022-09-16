class Solution {
public:
    bool checkIfExist(vector<int>& arr) {
        unordered_map<int,int> mp;
        for(int i=0;i<arr.size();i++){
            if(mp.find(arr[i]) == mp.end())
                mp[arr[i]]=i;
            else if(arr[i] == 0)
                mp[arr[i]]=2;
        }
        for(int i=0;i<arr.size();i++){
            if(mp.find(arr[i]*2) != mp.end() && (mp[arr[i]] >= 2 || mp[arr[i]] != mp[arr[i]*2]))
            {
                return true;
            }
        }
        return false;
    }
};