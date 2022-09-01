class Solution {
public:
    bool check(vector<int>& nums) {
        if(nums.size() == 0 || nums.size() == 1 || nums.size() == 2)
            return true;
        bool sorted=false;
        int i=0;
        int peak=0;
        while(i < nums.size()-1){
            if(nums[i] <= nums[i+1])
                sorted=true;
            else
                peak++;
            i++;
            if(peak >= 2){
                sorted=false;
                return false;
            }
        }
        if(peak == 1 && nums[0] >= nums[nums.size()-1] && sorted)
            return true;
        else if(peak == 0 && sorted)
            return true;
        return false;
    }
};