class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum=0,subArrayCount = 0;
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int anotherNo = sum - k;
            if(map.containsKey(anotherNo)){
                subArrayCount += map.get(anotherNo);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return subArrayCount;
    }
}