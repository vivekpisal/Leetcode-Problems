class Solution {
    bool check_rev(vector<int> arr){
        int left=0,right=arr.size()-1;
        bool f=false;
        while(left < right){
            if(arr[left] == arr[right])
                f=true;
            else{
                f=false;
                break;
            }
            left++;
            right--;
        }
        return f;
    }
    
public:
    bool isPalindrome(int x) {
        if(x < 0) return false;
        
        if(x >= 0 && x <= 9) return true;
        
        int no=x;
        vector<int> revno;
        while(no > 0){
            int rem=no%10;
            no=no/10;
            revno.push_back(rem);
        }
        if(check_rev(revno))
            return true;
        return false;
    }
};