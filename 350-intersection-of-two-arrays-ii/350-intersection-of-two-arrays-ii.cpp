class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        unordered_map<int,int> mp;
        for(int i=0;i<nums2.size();i++){
            if(mp.find(nums2[i]) != mp.end())
                mp[nums2[i]]++;
            else
                mp[nums2[i]]=1;
        }
        vector<int> ans;
        for(int i=0;i<nums1.size();i++){
            if(mp.find(nums1[i]) != mp.end()){
                ans.push_back(nums1[i]);
                mp[nums1[i]]--;
                if(mp[nums1[i]] == 0)
                    mp.erase(nums1[i]);
            }
        }
        return ans;
    }
};