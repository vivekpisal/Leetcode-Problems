//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int i=0,j=0,n=s.length();
        int longSubstr=-1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(j < n){
            char c = s.charAt(j);
            if(map.size() <= k){
                map.put(c,map.getOrDefault(c,0)+1);
                j++;
                if(map.size() == k){
                    longSubstr = Math.max(longSubstr,j-i);
                }
            }else if(map.size() > k){
                char r = s.charAt(i);
                map.put(r,map.get(r)-1);
                if(map.get(r) == 0){
                    map.remove(r);
                }
                i++;
            }
        }
        return longSubstr;
    }
}