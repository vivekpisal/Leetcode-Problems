class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int odd=0,total=0,n=nums.length,j=0,count=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2==1){
                odd++;
                if(odd >= k){
                    count=1;
                    while(j < n && nums[j++]%2==0)
                        count++;
                    total+=count;
                }
            }else if(odd >= k){
                total+=count;
            }
        }
        return total;
    }
}