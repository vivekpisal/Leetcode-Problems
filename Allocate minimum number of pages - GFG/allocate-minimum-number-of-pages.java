//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends
class Solution 
{
    public static int allocateBooks(int arr[],int page,int m){
        int count=0,pageCount=0;
        for(int i=0;i<arr.length;i++){
            if(pageCount + arr[i] <= page){
                pageCount+=arr[i];
            }
            else{
                count++;
                pageCount=arr[i];
            }
        }
        return count;
    }
    public static int findPages(int[]A,int N,int M)
    {
        if(M > N) return -1;
        int lo=Arrays.stream(A).max().getAsInt()
        ,hi=Arrays.stream(A).sum(),mid=0;
        while(lo <= hi){
            mid=(lo+hi)/2;
            int count = allocateBooks(A,mid,M);
            if(count >= M){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return lo;
    }
};