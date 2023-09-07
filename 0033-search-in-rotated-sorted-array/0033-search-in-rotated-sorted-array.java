class Solution {
    public int search(int[] nums, int target) {
        int st=0,end=nums.length-1,mid=0;
        while(end >= st){
            mid=(st+end)/2;
            if(nums[mid] == target) return mid;
            else if(nums[st] <= nums[mid]){
                if(nums[st] <= target && nums[mid] >= target){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{
                if(nums[mid] <= target && nums[end] >= target){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}