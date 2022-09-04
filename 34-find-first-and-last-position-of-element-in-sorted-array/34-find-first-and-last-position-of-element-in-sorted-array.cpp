class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> pos={-1,-1};
        bool f=false;
        for(int i=0;i<nums.size();i++){
            if(f == false && nums[i] == target)
            {pos[0]=i;pos[1]=i;f=true;}
            else if(f == true && nums[i] == target)
                pos[1]=i;
        }
        return pos;
    }
};