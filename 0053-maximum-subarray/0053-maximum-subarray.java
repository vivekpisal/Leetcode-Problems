class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int maxSubArr=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum > maxSubArr){
                maxSubArr=sum;
            }
            if(sum < 0){
                sum=0;
            }
            
        }
        return maxSubArr;
    }
}