class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        unordered_map<int,int> mp;
        int ele=0;
        for(int i:nums){
            if(mp.find(i) != mp.end())
            {ele=i;break;}
            else
                mp[i]=1;
        }
        return ele;
    }
};