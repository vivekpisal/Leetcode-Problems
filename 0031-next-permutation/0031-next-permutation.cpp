class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        int brp=nums.size()-2;
        while(brp >= 0) {
            if(nums[brp] < nums[brp+1])
                break;
            brp--;
        }
        int loc=nums.size()-1;
        if(brp != -1){
            while(loc >= brp){
                if(nums[loc] > nums[brp])
                    break;
                loc--;
            }
            swap(nums[brp],nums[loc]);
        }
        reverse(nums.begin()+brp+1,nums.end());
    }
};