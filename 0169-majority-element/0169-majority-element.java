class Solution {
    public int majorityElement(int[] nums) {
        int majorityEle = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                majorityEle = nums[i];
                count++;
            }
            else if(majorityEle != nums[i]){
                count--;
            }else if(majorityEle == nums[i]){
                count++;
            }
        }
        return majorityEle;
    }
}