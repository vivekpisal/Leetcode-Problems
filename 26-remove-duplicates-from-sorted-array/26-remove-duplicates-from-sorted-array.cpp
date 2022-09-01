class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        
        int i=1,j=1;
        while(j < nums.size()){
            if(nums[j] == nums[j-1])
                j++;
            else{
                nums[i]=nums[j];
                i++;
                j++;
            }
        }
        return i;
        
        // int count=0;
        // for(int i=1;i<nums.size();i++){
        //     if(nums[i] == nums[i-1])
        //         count++;
        //     else
        //         nums[i-count]=nums[i];
        // }
        // return nums.size()-count;
    }
};