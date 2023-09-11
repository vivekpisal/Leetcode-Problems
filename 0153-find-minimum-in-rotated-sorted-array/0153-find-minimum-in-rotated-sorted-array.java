class Solution {
    public int findMin(int[] nums) {
        int st=0,end=nums.length-1,mid=0;
        int min=Integer.MAX_VALUE;
        while(st <= end){
            mid=(st+end)/2;
            if(nums[mid] <= nums[end]){
                end=mid-1;
                min=Math.min(min,nums[mid]);
            }else{
                st=mid+1;
            }
        }
        return min;
    }
}