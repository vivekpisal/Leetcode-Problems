class Solution {
    public void subSet(int []nums,Set<List<Integer>> set,int i,List<Integer> list){
        if(i == nums.length){
            List<Integer> sets = new ArrayList<>(list);
            Collections.sort(sets);
            set.add(sets);
            return;
        }
        
        list.add(nums[i]);
        subSet(nums,set,i+1,list);
        list.remove(list.size()-1);
        subSet(nums,set,i+1,list);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        subSet(nums,set,0,list);
        List<List<Integer>> subSets = new ArrayList<>(set);
        return subSets;
    }
}