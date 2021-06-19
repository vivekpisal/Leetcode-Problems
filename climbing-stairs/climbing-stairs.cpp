class Solution {
public:
    int climbStairs(int n) {
        if(n == 1)
            return 1;
        vector<int> steps(n,0);
        steps[0]=1;
        steps[1]=2;
        for(int i=2;i<n;i++)
        {
            steps[i]=steps[i-1]+steps[i-2];
        }
        return steps[n-1];
    }
};