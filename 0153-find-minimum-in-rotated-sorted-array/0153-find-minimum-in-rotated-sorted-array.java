class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) return nums[0];
        int low=0,high=nums.length-1,mid=0;
        while(low <= high){
            mid=(high+low)/2;
            if(mid-1 != -1 && mid+1 != nums.length && nums[mid-1] > nums[mid] && nums[mid+1] > nums[mid]){
                return nums[mid];
            }else if(nums[low] <= nums[mid] && !(nums[low] <= nums[high])){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        if(nums[0] < nums[nums.length-1])
            return nums[0];
        return nums[nums.length-1];
    }
}