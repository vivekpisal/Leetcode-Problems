class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            int l=i+1,r=n;
            while(r > l){
                int sum = nums[i] + nums[r] + nums[l];
                if(sum == 0){
                    List<Integer> subAns = new ArrayList<>();
                    subAns.add(nums[i]);
                    subAns.add(nums[r]);
                    subAns.add(nums[l]);
                    ans.add(subAns);
                    while(l+1 < n && nums[l+1] == nums[l])
                        l++;
                    l++;
                    r--;
                }else if(sum > 0){
                    r--;
                }else if(sum < 0){
                    l++;
                }
            }
        }
        return ans;
    }
}