//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends
class Solution {
    private static boolean kCowsMaxDis(int[] stalls,int k,int dis){
        int cowCount=1, position=stalls[0];
        for(int i=1; i<stalls.length; i++){
            if(stalls[i]-position >= dis){
                cowCount++;
                if(cowCount == k)
                    return true;
                position = stalls[i];     
            }
        }
        return false;
    }
    public static int solve(int n, int k, int[] stalls) {
        int lo=0,hi=Integer.MAX_VALUE,mid=0;
        Arrays.sort(stalls);
        int minDis=0;
        while(lo <= hi){
            mid=(lo+hi)/2;
            boolean kCows = kCowsMaxDis(stalls,k,mid);
            if(kCows){
                minDis=mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return minDis;
    }
}