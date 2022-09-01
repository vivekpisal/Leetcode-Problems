class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int z=0;
        int n=0;
        while(z < nums.size()){
            if(nums[z] == 0){
                n=z+1;
                while(n < nums.size() && nums[n] == 0){n++;}
                
                if(n < nums.size())
                    swap(nums[n],nums[z]);
            }
            z++;
        }
        
    }
};