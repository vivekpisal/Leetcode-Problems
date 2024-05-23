class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int low=1,high=46340,mid=0;
        while(low <= high){
            mid=low + (high-low)/2;
            if(mid*mid > num){
                high=mid-1;
            }else if(mid*mid < num){
                low=mid+1;
            }else{
                return true;
            }
        }
        return false;
    }
}