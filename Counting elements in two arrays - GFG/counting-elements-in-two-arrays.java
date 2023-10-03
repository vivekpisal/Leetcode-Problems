//{ Driver Code Starts
import java.util.*;

class Count
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int m = sc.nextInt();
            int n = sc.nextInt();
            
            int arr1[] = new int[m];
            int arr2[] = new int[n];
            
            for(int i = 0; i < m; i++)
              arr1[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              arr2[i] = sc.nextInt();
              
            Solution gfg = new Solution();
            ArrayList<Integer> res = gfg.countEleLessThanOrEqual(arr1, arr2, m, n);
            for (int i = 0; i < res.size(); i++)
                System.out.print (res.get (i) + " ");
            System.out.println();
        }
        
    }
}
// } Driver Code Ends


// Complete the function given below
class Solution
{
    private static int lastOcuOrGrt(int arr[],int tar){
        int lo=0,hi=arr.length-1;
        int mid=0,ans=-1;
        while(lo <= hi){
            mid = (lo+hi)/2;
            if(arr[mid] == tar) {
                lo=mid+1;
                ans=mid+1;
            }
            else if(arr[mid] > tar) hi=mid-1;
            else if(arr[mid] < tar) lo=mid+1;
        }
        return ans != -1?ans:lo;
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            int count = lastOcuOrGrt(arr2,arr1[i]);
            ans.add(count);
        }
        return ans;
    }
}