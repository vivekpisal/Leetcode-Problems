**Using Extra Space**
```
void permutations(vector<int> nums,vector<int>& ds,vector<bool>& mp,vector<vector<int>> &ans){
if(ds.size() == nums.size()){
ans.push_back(ds);
return;
}
for(int i=0;i<nums.size();i++){
if(mp[i] != true){
ds.push_back(nums[i]);
mp[i]=true;
permutations(nums,ds,mp,ans);
ds.pop_back();
mp[i]=false;
}
}
}
vector<vector<int>> permute(vector<int>& nums) {
vector<bool> mp(nums.size(),false);
vector<vector<int>> ans;
vector<int> ds;
permutations(nums,ds,mp,ans);
return ans;
}
```
**Without using extra space**
```
class Solution {
public:
vector<vector<int>> ans;
void permutation(vector<int> nums,int i){
if(i == nums.size()-1){
ans.push_back(nums);
return;
}
for(int j=i;j<nums.size();j++){
swap(nums[i],nums[j]);
permutation(nums,i+1);
swap(nums[i],nums[j]);
}
}
vector<vector<int>> permute(vector<int>& nums) {
permutation(nums,0);
return ans;
}
};
```