class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int max=INT_MIN,sum=0;
        if(nums.size() == 1) return nums[0];
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(sum > max){
                max=sum;
            }
            if(sum < 0){
                sum=0;
            }
        }
        return max;
    }
};