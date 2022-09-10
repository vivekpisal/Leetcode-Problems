class Solution {
public:
    bool judgeSquareSum(int c) {
        long long low=0,high=sqrt(c);
        while(low <= high){
            long long mul=low*low + high*high;
            if(mul == c)
                return true;
            else if(mul > c)
                high=high-1;
            else
                low=low+1;
        }
        return false;
    }
};