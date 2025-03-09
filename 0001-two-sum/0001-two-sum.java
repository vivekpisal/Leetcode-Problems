class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int twoPair[] = new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target - nums[i])){
                twoPair[0] = i;
                twoPair[1] = map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }
        return twoPair;
    }
}