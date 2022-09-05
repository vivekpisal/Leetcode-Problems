class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> ans(2,-1);
        int eleFoundAtIndex=-1;
        int low=0,high=nums.size()-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                eleFoundAtIndex=mid;
                high=mid-1;
            }
            else if(nums[mid] > target)
                high=mid-1;
            else
                low=mid+1;
        }
        if(eleFoundAtIndex == -1)
            return ans;
        else
            ans[0]=eleFoundAtIndex;
        low=0,high=nums.size()-1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                eleFoundAtIndex=mid;
                low=mid+1;
            }
            else if(nums[mid] > target)
                high=mid-1;
            else
                low=mid+1;
        }
        ans[1]=eleFoundAtIndex;
        return ans;
    }
};