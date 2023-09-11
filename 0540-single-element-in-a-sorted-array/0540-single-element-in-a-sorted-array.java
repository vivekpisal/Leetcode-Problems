class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];

        int st=0,end=nums.length-1,mid=0,n=nums.length-1,ans=0;
        while(st <= end){
            mid=(st+end)/2;
            if(mid%2 == 0){
                if(mid-1 >= 0 && nums[mid-1] == nums[mid]){
                    end=mid-1;
                }else if(mid+1 <= n && nums[mid+1] == nums[mid]){
                    st=mid+1;
                }else{
                    ans=nums[mid];
                    break;
                }
            }else{
                if(mid-1 >= 0 && nums[mid-1] == nums[mid]){
                    st=mid+1;
                }else if(mid+1 <= n && nums[mid+1] == nums[mid]){
                    end=mid-1;
                }else{
                    ans=nums[mid];
                }
            }
        }
        return ans;
    }
}