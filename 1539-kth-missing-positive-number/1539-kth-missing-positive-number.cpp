class Solution {
public:
    int findKthPositive(vector<int>& arr, int k) {
        unordered_map<int,int> mp;
        for(int i:arr){
            if(mp.find(i) != mp.end())
                mp[i]++;
            else
                mp[i]=1;
        }
        int missing=0;
        while(k){
            missing++;
            if(mp.find(missing) == mp.end())
            {k--;}
        }
        return missing;
    }
};