class Solution {
public:
    int specialArray(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int len=nums.size();
        int low=0,high=len-1;
        while(low <= high){
            int mid=(low + high)/2;
            if(nums[mid] >= len-mid){
                if(mid == 0 || nums[mid-1] < len-mid)
                    return len-mid;
                else
                    high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
};