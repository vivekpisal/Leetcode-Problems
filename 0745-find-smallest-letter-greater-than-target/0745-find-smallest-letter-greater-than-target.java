class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int lo=0,hi=letters.length-1;
        int mid=0;
        while(lo <= hi){
            mid=(lo+hi)/2;
            if(letters[mid] == target){
                lo=mid+1;
            }
            else if(letters[mid] > target){
                hi=mid-1;
            }else if(letters[mid] < target){
                lo=mid+1;
            }
        }
        return lo >= letters.length ? letters[0]:letters[lo];
    }
}