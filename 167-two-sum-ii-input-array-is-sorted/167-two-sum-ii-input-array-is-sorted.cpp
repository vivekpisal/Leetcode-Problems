class Solution {
public:
    int bSearch(vector<int> &numbers,int target,int low,int high){
        while(low <= high){
            int mid=low + (high-low)/2;
            if(numbers[mid] == target)
                return mid;
            else if(numbers[mid] > target)
                high=mid-1;
            else if(target > numbers[mid])
                low=mid+1;
        }
        return 0;
    }
    
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> ans;
        for(int i=0;i<numbers.size();i++){
            int pos=bSearch(numbers,target-numbers[i],i+1,numbers.size()-1);
            if(pos){
                ans.push_back(i+1);
                ans.push_back(pos+1);
            }
        }
        return ans;
    }
};