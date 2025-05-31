class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(cnt1 == 0 && ele2 != nums[i]){
                cnt1=1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && ele1 != nums[i]){
                cnt2=1;
                ele2 = nums[i];
            }
            else if(ele2 == nums[i]) cnt2++;
            else if(ele1 == nums[i]) cnt1++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1) cnt1++;
            if (nums[i] == ele2) cnt2++;
        }
        int maxCountThen = (nums.length/3)+1;
        if(cnt1 >= maxCountThen){
            list.add(ele1);
        }
        if(cnt2 >= maxCountThen){
            list.add(ele2);
        }
        return list;
    }
}