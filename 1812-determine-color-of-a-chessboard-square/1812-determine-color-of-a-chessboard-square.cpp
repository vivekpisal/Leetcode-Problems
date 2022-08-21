class Solution {
public:
    bool squareIsWhite(string coordinates) {
        int x=abs(96-coordinates[0]);
        int y=coordinates[1];
        if(x%2 == 0){
            if(y%2 == 0)
                return false;
            else
                return true;
        }
        else{
            if(y%2 == 0)
                return true;
            return false;
        }
    }
};