class Solution {
public:
    void sortColors(vector<int>& nums) {
        int l=0,h=nums.size()-1,m=0;
        while(m <= h){
            if(nums[m] == 1)
                m++;
            else if(nums[m] == 0){
                swap(nums[m],nums[l]);
                l++;
                m++;
            }
            else if(nums[m] == 2){
                swap(nums[m],nums[h]);
                h--;
            }
        }
    }
};