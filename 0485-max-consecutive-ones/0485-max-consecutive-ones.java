class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0,counter = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                counter++;
                maxOnes = Math.max(counter,maxOnes);
            }
            else{
                counter = 0;
            }
        }
        return maxOnes;
    }
}