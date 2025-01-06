class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0,-1);
        int sum = 0,max = 0;

        for(int i=0;i<nums.length;i++){
            sum += nums[i] == 0 ? -1 : nums[i];
            if(sumToIndex.containsKey(sum)){
                max = Math.max(max,i - sumToIndex.get(sum));
            }else{
                sumToIndex.put(sum,i);
            }
        }
        return max;
    }
}