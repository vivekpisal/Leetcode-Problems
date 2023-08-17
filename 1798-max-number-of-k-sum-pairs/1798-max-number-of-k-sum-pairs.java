class Solution {
    public int maxOperations(int[] nums, int k) {
        int pairs=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int i=0;i<nums.length;i++){
            int anotherNo=k-nums[i];
            if(map.containsKey(nums[i]) && map.get(nums[i]) > 0){
                map.put(nums[i],map.get(nums[i])-1);
                boolean f=false;
                if(map.containsKey(anotherNo) && map.get(anotherNo) > 0){
                    map.put(anotherNo,map.get(anotherNo)-1);
                    f=true;
                    pairs++;
                }
                if(!f){
                    map.put(nums[i],map.get(nums[i])+1);
                }
            }
        }
        return pairs;
    }
}