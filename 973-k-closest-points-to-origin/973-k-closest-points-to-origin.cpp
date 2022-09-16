class Solution {
public:
    vector<vector<int>> kClosest(vector<vector<int>>& points, int k) {
        priority_queue<pair<int,pair<int,int>>> maxH;
        for(int i=0;i<points.size();i++){
            int dis=(pow(points[i][0],2) + pow(points[i][1],2));
            maxH.push({dis,{points[i][0],points[i][1]}});
            if(maxH.size() > k)
                maxH.pop();
        }
        vector<vector<int>> kClose;
        while(!maxH.empty()){
            auto ele=maxH.top();
            maxH.pop();
            vector<int> temp={ele.second.first,ele.second.second};
            kClose.push_back(temp);
        }
        return kClose;
    }
};