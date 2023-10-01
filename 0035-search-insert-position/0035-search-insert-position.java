class Solution {
    public int searchInsert(int[] nums, int target) {
        int lo=0,hi=nums.length-1,mid=0;
        while(hi >= lo){
            mid=(lo+hi)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target)
                hi=mid-1;
            else if(nums[mid] < target)
                lo=mid+1;
        }
        return lo;
    }
}