class Solution {
    public void combSum2(int nums[],int target,int ind,List<Integer> list,List<List<Integer>> comb){
        if(target == 0){
            comb.add(new ArrayList<>(list));
            return;
        }

        for(int i=ind;i<nums.length;i++){
            if(target < nums[i]) break;

            if(i != ind && nums[i] == nums[i-1]) continue;

            list.add(nums[i]);
            combSum2(nums,target-nums[i],i+1,list,comb);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        combSum2(candidates,target,0,temp,list);
        return list;
    }
}