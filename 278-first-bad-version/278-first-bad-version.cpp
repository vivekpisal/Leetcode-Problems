// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        int low=1,high=n,firstBad=-1;
        while(low <= high){
            int mid=low + (high-low)/2;
            if(isBadVersion(mid)){
                firstBad=mid;
                high=mid-1;
            }
            else if(!isBadVersion(mid))
                low=mid+1;
        }
        return firstBad;
    }
};