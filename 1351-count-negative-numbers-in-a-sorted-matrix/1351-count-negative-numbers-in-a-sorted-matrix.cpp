class Solution {
private:
    int findNegNo(vector<int>&arr){
        int low=0,high=arr.size()-1;
        int mid=0;
        int ans=-1;
        while(low <= high){
            mid=(low + high)/2;
            if(arr[mid] < 0){
                ans=mid;high=mid-1;
            }
            else if(arr[mid] >= 0)
                low=mid+1;
        }
        if(ans != -1)
            return arr.size()-ans;
        return 0;
    }
public:
    int countNegatives(vector<vector<int>>& grid) {
        int negNo=0;
        for(int i=0;i<grid.size();i++){
            negNo+=findNegNo(grid[i]);
        }
        return negNo;
    }
};