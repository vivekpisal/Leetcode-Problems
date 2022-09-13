class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        int lastStone=0;
        priority_queue<int> maxH(stones.begin(),stones.end());
        while(maxH.size() > 1){
            int y=maxH.top();
            maxH.pop();
            int x=maxH.top();
            maxH.pop();
            if(y!=x)
                maxH.push(y-x);
        }
        if(maxH.size() == 1)
            lastStone=maxH.top();
        return lastStone;
    }
};