class Solution {
public:
    int reverse(int x) {
        bool neg=false;
        if(x < 0){
            neg=true;
        }
        string s=to_string(x);
        int l=s.size();
        if(neg == true)
            l--;
        long rev_no=0;
        while(x != 0){
            int last_no=x%10;
            x=x/10;
            rev_no=rev_no + last_no * pow(10,--l);
        }
        if(rev_no > pow(2,31)-1 || rev_no < -pow(2,31))
            return 0;
        
       
        return rev_no;
    }
};