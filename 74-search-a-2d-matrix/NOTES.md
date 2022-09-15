```
private:
bool binSearch(vector<int> &arr,int target){
int low=0,high=arr.size()-1;
while(low <= high){
int mid=(low + high)/2;
if(arr[mid] == target)
return true;
else if(arr[mid] > target)
high=mid-1;
else if(arr[mid] < target)
low=mid+1;
}
return false;
}
public:
bool searchMatrix(vector<vector<int>>& matrix, int target) {
if(matrix.size() == 0)
return false;
int lastColIndex=matrix[0].size()-1;
for(int i=0;i<matrix.size();i++){
if(matrix[i][0] <= target && matrix[i][lastColIndex] >= target){
if(binSearch(matrix[i],target))
return true;
}
}
return false;
}
```