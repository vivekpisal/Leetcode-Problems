class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longSeq = 0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        for(int i:set){
            if(!set.contains(i-1)){
                int start = i;
                int seq = 0;
                while(set.contains(start)){
                    seq++;
                    start++;
                }
                longSeq = Math.max(longSeq,seq);
            }
        }
        return longSeq;
    }
}