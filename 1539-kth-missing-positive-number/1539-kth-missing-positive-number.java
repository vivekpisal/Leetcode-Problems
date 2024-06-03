class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start=0,end=arr.length,n=arr.length;
        int diff=0,mid=0;
        while(start < end){
            mid=(start+end)/2;
            diff = arr[mid]-mid-1;
            if(diff < k){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start+k;
    }
}