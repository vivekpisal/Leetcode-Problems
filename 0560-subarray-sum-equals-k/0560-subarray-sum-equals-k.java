class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int totalSubArray = 0,sum = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem = sum - k;
            if(map.containsKey(rem)){
                totalSubArray+=map.get(rem);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return totalSubArray;
    }
}