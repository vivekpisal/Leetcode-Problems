class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        char smallestL='0';
        int low=0,high=letters.size();
        while(low <= high){
            int mid=low + (high-low)/2;
            if(letters[mid] == target)
                low=mid+1;
            else if(letters[mid] > target){
                smallestL=letters[mid];
                high=mid-1;
            }
            else
                low=mid+1;
        }
        if(smallestL == '0')
            smallestL=letters[0];
        return smallestL;
    }
};