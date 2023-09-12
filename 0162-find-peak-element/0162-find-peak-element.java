class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;
        int st=0,end=nums.length-1,mid=0,n=nums.length-1;
        while(st <= end){
            mid=(st+end)/2;
            int previousVal = mid == 0?Integer.MIN_VALUE:nums[mid-1];
            int nextVal = mid == n?Integer.MIN_VALUE:nums[mid+1];
            if(nums[mid] > previousVal && nums[mid] > nextVal){
                return mid;
            }else if(nums[mid] < previousVal){
                end=mid-1;
            }else if(nums[mid] < nextVal){
                st=mid+1;
            }
        }
        return -1;
    }
}