class Solution {
public:
    int fib(int n) {
        if(n <= 0)
            return 0;
        int first=0,second=1;
        while(n-1!=0){
            int temp=second;
            second=second+first;
            first=temp;
            n--;
        }
        return second;
    }
};