class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int sum=0,max=INT_MIN;
        if(nums.size() == 1) return nums[0];
        
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            if(sum > max)
                max=sum;
            if(sum < 0){
                if(sum > max)
                    max=sum;
                sum=0;
            }
            
        }
        return max;
    }
};