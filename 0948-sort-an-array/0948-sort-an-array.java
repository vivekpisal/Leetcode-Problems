class Solution {
    public int[] sortArray(int[] nums) {
        Queue<Integer> minH = new PriorityQueue<>();
        for(int i:nums){
            minH.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=minH.poll();
        }
        return nums;
    }
}