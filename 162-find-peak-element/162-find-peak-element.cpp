class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        if(nums.size()==1)
            return 0;
        int peak=0;
        for(int i=1;i<nums.size();i++){
            if(i != 0 && i != nums.size()-1 && nums[i-1] < nums[i] && nums[i] > nums[i+1])
                {peak=i;break;}
            else if(i == 0 && nums[i] > nums[i+1])
                peak=i;
            else if(i == nums.size()-1 && nums[i] > nums[i-1])
                peak=i;
        }
        return peak;
    }
};