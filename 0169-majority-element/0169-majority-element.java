class Solution {
    public int majorityElement(int[] nums) {
        int majEle = nums[0],count = 1;
        for(int i=1;i<nums.length;i++){
            if(count == 0){
                majEle = nums[i];
                count = 1;
            }
            else if(nums[i] == majEle){
                count++;
            }
            else if(nums[i] != majEle){
                count--;
            }
        }
        return majEle;
    }
}