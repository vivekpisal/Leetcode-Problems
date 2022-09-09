class Solution {
public:
    int findTheDistanceValue(vector<int>& arr1, vector<int>& arr2, int d) {
        int no=0;
        for(int i=0;i<arr1.size();i++){
            bool f=true;
            for(int j=0;j<arr2.size();j++){
                int sub=abs(arr1[i]-arr2[j]);
                if(sub <= d)
                    {f=false;break;}
            }
            if(f)
                no++;
        }
        return no;
    }
};