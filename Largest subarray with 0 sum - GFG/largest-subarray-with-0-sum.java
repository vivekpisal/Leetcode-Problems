//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int prefixSum=0;
        int maxLength=0;
        for(int i=0;i<n;i++){
            prefixSum+=arr[i];
            if(prefixSum == 0){
                maxLength = Math.max(maxLength,i+1);
            }
            if(map.containsKey(prefixSum)){
                maxLength = Math.max(maxLength,i-map.get(prefixSum));
            }else{
                map.put(prefixSum,i);
            }
        }
        return maxLength;
    }
}