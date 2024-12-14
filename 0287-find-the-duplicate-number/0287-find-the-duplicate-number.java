class Solution {
    public int findDuplicate(int[] nums) {
        int fastPointer = 0;
        int slowPointer = 0;
        do{
            fastPointer = nums[nums[fastPointer]];
            slowPointer = nums[slowPointer];
        }
        while(fastPointer != slowPointer);
        slowPointer = 0;
        while(slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        return slowPointer;
    }
}