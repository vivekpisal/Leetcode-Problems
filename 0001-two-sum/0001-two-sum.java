class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]={-1,-1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num2 = target - nums[i];
            if(map.containsKey(num2)){
                ans[0]=i;
                ans[1]=map.get(num2);
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}