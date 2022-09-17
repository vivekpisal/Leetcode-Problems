class Solution {
public:
    double Pow(double x,int n){
        if(n == 0)
            return 1;
        
        double nby2 = myPow(x,n/2);
        double ans=nby2 * nby2;
        if(n%2 == 1)
            ans=ans*x;
        return ans;
    }
    double myPow(double x, int n) {
        double ans=Pow(x,abs(n));
        if(n < 0)
            return 1/ans;
        return ans;
    }
};