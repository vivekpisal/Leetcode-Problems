class Solution {
public:
    int findKthLargest(vector<int>& nums, int k) {
        priority_queue<int> maxHeap;
        for(int i:nums){
            maxHeap.push(i);
        }
        int kthLar=-1;
        while(k){
            kthLar=maxHeap.top();
            maxHeap.pop();
            k--;
        }
        return kthLar;
    }
};