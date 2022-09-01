class Solution {
public:
    int missingNumber(vector<int>& nums) {
        vector<int> present(nums.size()+1,0);
        for(int i=0;i<nums.size();i++){
            present[nums[i]]=1;
        }
        int noNotPresent=0;
        for(int i=0;i<present.size();i++){
            if(present[i] == 0)
                noNotPresent=i;
        }
        return noNotPresent;
    }
};