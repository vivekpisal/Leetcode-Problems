//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            String[] S1 = s.split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            Solution ob = new Solution();
            int ans = ob.NthRoot(n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends
class Solution
{
    public int NthRoot(int n, int m)
    {
         int st=1,end=m,mid=0;
         while(st <= end){
             mid=(st+end)/2;
             int pow = (int)Math.pow(mid,n);
             if(pow == m) return mid;
             else if(pow > m) end=mid-1;
             else st=mid+1;
         }
         return -1;
    }
}