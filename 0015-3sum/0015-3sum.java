class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> threeSum = new ArrayList<>();
        for(int i=0;i<n-2;i++){
            while(i != 0 && i < n-2 && nums[i] == nums[i-1]) i++;

            for(int j=i+1;j<n-1;j++){
                while(j != i+1 && j < n-1 && nums[j] == nums[j-1]) j++;

                int target = nums[i] + nums[j];
                int start=j+1,end=nums.length-1,mid=(start+end)/2;
                
                while(start <= end){
                    mid=(start+end)/2;
                    if(nums[mid] + target == 0){
                        threeSum.add(List.of(nums[i],nums[j],nums[mid]));
                        break;
                    }
                    else if(nums[mid] + target > 0){
                        end=mid-1;
                    }
                    else if(nums[mid] + target < 0){
                        start=mid+1;
                    }
                }
            }
        }
        return threeSum;
    }
}