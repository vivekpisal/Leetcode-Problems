class Solution {
    public int minCapability(int[] nums, int k) {
        int lo=0,hi=Integer.MAX_VALUE;
        int mid=0,ans=Integer.MAX_VALUE;
        while(lo <= hi){
            mid=(lo+hi)/2;
            int cnt=0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] <= mid){
                    cnt++;
                    i++;
                }
            }
            if(cnt >= k){
                ans=Math.min(ans,mid);
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}