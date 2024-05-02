class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int ele1=0,ele2=0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                ele1=nums[i];
                cnt1++;
            }else if(cnt2 == 0 && ele1 != nums[i]){
                ele2=nums[i];
                cnt2++;
            }else if(ele1 == nums[i])
                cnt1++;
            else if(ele2 == nums[i])
                cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;cnt2=0;
        for(int i=0;i<nums.length;i++){
            if(ele1 == nums[i]) cnt1++;
            if(ele2 == nums[i]) cnt2++;
        }
        int mini = (nums.length/3) + 1;
        if(cnt1 != 0 && mini <= cnt1)ans.add(ele1);
        if(cnt2 != 0 && ele1 != ele2 && mini <= cnt2)ans.add(ele2);
        Collections.sort(ans);
        return ans;
    }
}