class Solution {
public:
    int findMin(vector<int>& nums) {
        int low=0,high=nums.size()-1;
        while(low < high){
            if(nums[low] < nums[high])
                return nums[low];
            
            int mid=(low + high)/2;
            if(nums[low] <= nums[mid])
                low=mid+1;
            else
                high=mid;
        }
        return nums[low];
    }
};