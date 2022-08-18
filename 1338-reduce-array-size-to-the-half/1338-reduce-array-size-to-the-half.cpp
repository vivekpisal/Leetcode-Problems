class Solution {
public:
    int minSetSize(vector<int>& arr) {
        unordered_map<int,int> mp;
        priority_queue<pair<int,int>> max_heap;
        for(int i=0;i<arr.size();i++){
            if(mp.find(arr[i]) != mp.end())
                mp[arr[i]]++;
            else
                mp[arr[i]]=1;
        }
        for(auto &i:mp){
            max_heap.push({i.second,i.first});
        }
        int n=arr.size();
        int i=0;
        while(n > arr.size()/2){
            n-=max_heap.top().first;
            max_heap.pop();
            i++;
        }
        return i;
    }
};