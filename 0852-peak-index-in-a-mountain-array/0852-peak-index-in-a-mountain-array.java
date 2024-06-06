class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1,mid=0,n=arr.length-1;
        while(low <= high){
            mid=(low+high)/2;
            if(mid-1 >= 0 && mid+1 <= n && arr[mid-1] < arr[mid] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid-1 >= 0 && arr[mid-1] > arr[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        if(arr[0] < arr[n]) return n;
        return 0;
    }
}