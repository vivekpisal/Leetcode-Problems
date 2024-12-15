class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,ele1=0,cnt2=0,ele2=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele1){
                cnt1++;
            }else if(nums[i] == ele2){
                cnt2++;
            }
            else if(cnt1 == 0){
                cnt1 = 1;
                ele1 = nums[i];
            }else if(cnt2 == 0){
                ele2 = nums[i];
                cnt2 = 1;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        int minCount = (nums.length/3)+1;
        cnt1=0;cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == ele1) cnt1++;
            if(nums[i] == ele2) cnt2++;
        }
        if(cnt1 >= minCount) ans.add(ele1);
        if(cnt2 >= minCount && ele1 != ele2) ans.add(ele2);
        Collections.sort(ans);
        return ans;
    }
}