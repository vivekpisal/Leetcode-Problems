class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int ans[]=new int[j+1];
        int poi = j;
        while(i <= j){
            int sq1 = nums[i] * nums[i];
            int sq2 = nums[j] * nums[j];
            if(sq1 > sq2){
                ans[poi]=sq1;
                i++;
            }else{
                ans[poi]=sq2;
                j--;
            }
            poi--;
        }
        return ans;
    }
}