class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int low=0,high=numbers.size()-1;
        vector<int> ans;
        while(low <= high){
            int sumOfTwo=numbers[low] + numbers[high];
            if(sumOfTwo == target)
                {ans.push_back(low+1);ans.push_back(high+1);break;}
            else if(sumOfTwo > target)
                high=high-1;
            else
                low=low+1;
        }
        return ans;
    }
};