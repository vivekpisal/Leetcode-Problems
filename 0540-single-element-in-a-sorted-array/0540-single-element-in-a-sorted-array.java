class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];

        int ans=0;
        for(int i=0;i<nums.length;){
            if(i+1 < nums.length && nums[i] == nums[i+1]){
                i+=2;
            }else{
                ans=i;
                break;
            }
        }
        return nums[ans];
    }
}