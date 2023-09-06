class Solution {
    int firstPos(int[] nums,int target){
        int st=0,end=nums.length-1,mid=0;
        int res=-1;
        while(end >= st){
            mid=(st+end)/2;
            if(nums[mid] == target){
                res=mid;
                end=mid-1;
            }else if(nums[mid] > target){
                end=mid-1;
            }else if(nums[mid] < target){
                st=mid+1;
            }
        }
        return res;
    }

    int lastPos(int[] nums,int target){
        int st=0,end=nums.length-1,mid=0;
        int res=-1;
        while(end >= st){
            mid=(st+end)/2;
            if(nums[mid] == target){
                res=mid;
                st=mid+1;
            }else if(nums[mid] > target){
                end=mid-1;
            }else if(nums[mid] < target){
                st=mid+1;
            }
        }
        return res;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        ans[0]=firstPos(nums,target);
        ans[1]=lastPos(nums,target);
        return ans;
    }
}