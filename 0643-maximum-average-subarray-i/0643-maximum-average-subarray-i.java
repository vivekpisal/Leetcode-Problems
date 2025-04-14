class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start = 0,sum=0;
        double maxAverage = 0;
        for(int end=0;end<nums.length;end++){
            if(end < k){
                sum+=nums[end];
                maxAverage = sum*1.0 / k;
            }else{
                sum-=nums[start];
                sum+=nums[end];
                maxAverage = Math.max(maxAverage,sum*1.0/k);
                start++;
            }
        }
        return maxAverage;
    }
}