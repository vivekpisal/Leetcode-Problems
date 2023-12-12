class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxLength = 1;
        if(nums.length == 0) return 0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i]-1)){
                    int j=nums[i];
                    while(map.containsKey(j)){
                        j++;
                    }
                    maxLength = Math.max(maxLength,j-nums[i]);
                }
        }
        return maxLength;
    }
}