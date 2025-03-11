class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        int n = nums.length;
        while(low <= high){
            mid = (low + high) /2;
            if(mid % 2 == 0){
                if(mid-1 >= 0 && nums[mid] == nums[mid-1]){
                    high = mid-1;
                }else if(mid + 1 < n && nums[mid] == nums[mid+1]){
                    low = mid+1;
                }else{
                    return nums[mid];
                }
            }
            else{
                if(mid-1 >= 0 && nums[mid] == nums[mid-1]){
                    low = mid+1;
                }else if(mid + 1 < n && nums[mid] == nums[mid+1]){
                    high = mid-1;
                }else{
                    return nums[mid];
                }
            }
        }
        return 0;
    }
}