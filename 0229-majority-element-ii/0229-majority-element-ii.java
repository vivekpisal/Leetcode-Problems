class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majEle = new ArrayList<>();
        int cnt1=0,cnt2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        int minThre = (nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(cnt1 == 0 && ele1 != curr && ele2  != curr){
                ele1 = curr;
                cnt1++;
            }
            else if(cnt2 == 0 && ele2  != curr && ele1 != curr){
                ele2 = curr;
                cnt2++;
            }
            else if(ele1 == curr){
                cnt1++;
            }
            else if(ele2 == curr){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<nums.length;i++){
            int curr = nums[i];
            if(ele1 == curr)
                cnt1++;
            else if(ele2 == curr)
                cnt2++;
        }
        if(minThre <= cnt1)
            majEle.add(ele1);
        if(minThre <= cnt2)
            majEle.add(ele2);
        return majEle;
    }
}