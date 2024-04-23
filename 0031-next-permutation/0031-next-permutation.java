class Solution {
    public void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx == -1){
            Arrays.sort(nums);
            return;
        }
        int greaterNum = 0;
        for(int i=n-1;i>idx;i--){
            if(nums[i] > nums[idx]){
                greaterNum = i;
                break;
            }
        }
        swap(nums,idx,greaterNum);
        Arrays.sort(nums,idx+1,n);
    }
}