/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int low=0,high=n;
        int pick=-1;
        while(low <= high){
            int mid=low + (high-low)/2;
            int possibleAns=guess(mid);
            if(possibleAns == 0)
            {pick=mid;break;}
            else if(possibleAns == -1)
                high=mid-1;
            else 
                low=mid+1;
        }
        return pick;
    }
};