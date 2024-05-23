/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long low=1,high=n,mid=0;
        int firstBadVersion=0;
        while(low <= high){
            mid=(low+high)/2;
            if(isBadVersion((int)mid)){
                firstBadVersion=(int)mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return firstBadVersion;
    }
}