class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[nums1.length];
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.empty() && nums2[i] >= stack.peek()){
                stack.pop();
            }   
            if(stack.empty()) map.put(nums2[i],-1);
            else map.put(nums2[i],stack.peek());
            stack.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            nextGreater[i] = map.get(nums1[i]);
        }
        return nextGreater;
    }
}