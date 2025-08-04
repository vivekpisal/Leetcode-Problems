class Solution {
    public void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void generatePermutations(int idx,int nums[],List<List<Integer>> permutations){
        if(idx == nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i:nums) list.add(i);
            permutations.add(list);
            return;
        }

        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            generatePermutations(idx+1,nums,permutations);
            swap(nums,i,idx);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(0,nums,permutations);
        return permutations;
    }
}