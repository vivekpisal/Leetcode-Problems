class Solution {
    public int findDuplicate(int[] nums) {
        int slowPointer = 0;
        int fastPointer = 0;

        do{
            slowPointer = nums[slowPointer];
            fastPointer = nums[nums[fastPointer]];
        }while(slowPointer != fastPointer);

        slowPointer = 0;
        while(slowPointer != fastPointer){
            slowPointer = nums[slowPointer];
            fastPointer = nums[fastPointer];
        }
        return slowPointer;
    }
}