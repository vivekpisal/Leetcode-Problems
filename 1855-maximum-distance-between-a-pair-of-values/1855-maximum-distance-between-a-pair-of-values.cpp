class Solution {
private:
    int findPair(vector<int>& arr,int tar,int low,int high){
        int loc=-1;
        while(low <= high){
            int mid=(low + high)/2;
            if(arr[mid] >= tar){
                loc=mid;
                low=mid+1;
            }
            else
                high=mid-1;
        }
        return loc;
    }
public:
    int maxDistance(vector<int>& nums1, vector<int>& nums2) {
        int maxDis=0;
        for(int i=0;i<nums1.size();i++){
            int ans=findPair(nums2,nums1[i],i,nums2.size()-1);
            if(ans != -1 && ans-i > maxDis)
                maxDis=ans-i;
        }
        return maxDis;
    }
};