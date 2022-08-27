class Solution {
public:
    bool isPalindrome(int x) {
        if(x < 0) return false;
        long rev_no=0,ori_no=x;
        while(x != 0){
            int last_dig=x%10;
            x=x/10;
            rev_no = rev_no * 10 + last_dig;
        }
        if(rev_no == ori_no)
            return true;
        return false;
    }
};