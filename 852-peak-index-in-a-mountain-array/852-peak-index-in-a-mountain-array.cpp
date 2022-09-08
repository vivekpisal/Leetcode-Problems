class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int low=0,high=arr.size()-1;
        int mountain=-1;
        while(low <= high){
            int mid=low + (high-low)/2;
            if(mid-1 >= 0 && mid+1 < arr.size() && arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                {mountain=mid;break;}
            else if(mid +1 < arr.size() && arr[mid+1] > arr[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return mountain;
    }
};