class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int ans[] = new int[m+n];
        int k=0;
        while(i < m && j < n){
            if(nums1[i] > nums2[j]){
                ans[k]=nums2[j];
                j++;  
            }else{
                ans[k]=nums1[i];
                i++;
            }
            k++;
        }
        while(i < m){
           ans[k]=nums1[i];
            k++;
            i++; 
        }
        while(j < n){
            ans[k]=nums2[j];
            k++;
            j++;
        }
        k=0;
        while(k < m+n){
            nums1[k]=ans[k];
            k++;
        }
    }
}