class Solution {
public:
    int arrangeCoins(int n) {
        int steps=0;
        while(n > 0){
            if(steps < n){
                steps++;
                n=n-steps;
            }
            else
                n--;
        }
        return steps;
    }
};