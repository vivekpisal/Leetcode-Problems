class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st=0,end=0,minLen=Integer.MAX_VALUE,sum=0;
        for(int i=0;i<nums.length;i++){

                sum+=nums[end];
                

                for(;st<nums.length-1;st++){
                    if(sum-nums[st] >= target){
                        sum-=nums[st];
                    }else{
                        break;
                    }
                }
                if(sum >= target){
                    minLen = Math.min(end-st+1,minLen);
                }
                end++;
            
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}