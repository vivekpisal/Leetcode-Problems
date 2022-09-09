class Solution {
public:
    bool isPerfectSquare(int num) {
        int low=0,high=num;
        bool perSqr=false;
        while(low <= high){
            long long mid=(low + high)/2;
            long long midEle=mid*mid;
            if(num == midEle)
                {perSqr=true;break;}
            else if(num < midEle)
                high=mid-1;
            else
                low=mid+1;
        }
        return perSqr;
    }
};