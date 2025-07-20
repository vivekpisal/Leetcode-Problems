class Solution {
    public void combSum(int []nums,int target,int i,List<Integer> list,List<List<Integer>> allComb){
        if(i == nums.length || target < 0)
            return;
        if(target == 0){
            allComb.add(new ArrayList<Integer>(list));
            return;
        }
        list.add(nums[i]);
        combSum(nums,target-nums[i],i,list,allComb);
        list.remove(list.size()-1);
        combSum(nums,target,i+1,list,allComb);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> allComb = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combSum(candidates,target,0,list,allComb);
        return allComb;
    }
}