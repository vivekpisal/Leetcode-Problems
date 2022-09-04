class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int l=0,r=nums.size()-1;
        int pos=0;
        int mid=(l+r)/2;
        while(l <= r){
            mid=(l+r)/2;
            if(nums[mid] == target)
            {pos=mid;break;}
            else if(mid != 0 && nums[mid-1] < target && nums[mid] > target || (mid == 0 && nums[mid] > target))
            {pos=mid;break;}
            else if((mid == nums.size()-1 && nums[mid] < target)){
                pos=mid+1;break;
            }
            else if(nums[mid] > target)
                r=mid-1;
            else if(nums[mid] < target)
                l=mid+1;
        }
        return pos;
    }
};