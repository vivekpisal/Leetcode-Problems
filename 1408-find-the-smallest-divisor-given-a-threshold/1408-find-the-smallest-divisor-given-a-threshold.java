class Solution {
    private int sumDivisor(int nums[],int divisor){
        int quotientSum=0;
        for(int i=0;i<nums.length;i++){
            quotientSum+=(nums[i]/divisor);
            if(nums[i]%divisor != 0){
                quotientSum++;
            }
        }
        return quotientSum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int lo=1,hi=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        while(lo <= hi){
            int mid=(lo + hi)/2;
            int quotientSum = sumDivisor(nums,mid);
            if(quotientSum <= threshold){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}