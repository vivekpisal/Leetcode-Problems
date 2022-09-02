```
void rotate(vector<int>& nums, int k) {
vector<int> ans(nums.size());
for(int i=0;i<nums.size();i++){
ans[(i+k)%nums.size()]=nums[i];
}
for(int i=0;i<nums.size();i++){
nums[i]=ans[i];
}
}
```