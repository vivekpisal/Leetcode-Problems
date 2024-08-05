class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp[] = new int[m+n];
        int i=0,j=0,k=0;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                temp[k]=nums2[j];
                j++;
            }else{
                temp[k]=nums1[i];
                i++;
            }
            k++;
        }
        while(i < m){
            temp[k]=nums1[i];
            i++;k++;
        }
        while(j < n){
            temp[k]=nums2[j];
            k++;j++;
        }
        i=0;
        while(i < m+n){
            nums1[i]=temp[i];
            i++;
        }
    }
}