class Solution {
public:
    int reverse(int x) {
        long rev_no=0;
        while(x != 0){
            int last_no=x%10;
            x=x/10;
            rev_no=rev_no * 10 + last_no;
        }
        if(rev_no > INT_MAX || rev_no < INT_MIN)
            return 0;
        
        return rev_no;
    }
};