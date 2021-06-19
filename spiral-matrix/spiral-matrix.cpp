class Solution {
public:
    vector<int> spiralOrder(vector<vector<int>>& matrix) {
        int dir=0;
        int left=0,right=matrix[0].size()-1;
        int top=0,down=matrix.size()-1;
        vector<int> spiral;
        while(top <= down && left <= right)
        {
            if(dir == 0)
            {
                for(int i=left;i<=right;i++)
                    spiral.push_back(matrix[top][i]);
                top++;
            }
            else if(dir == 1)
            {
                for(int i=top;i<=down;i++)
                    spiral.push_back(matrix[i][right]);
                right--;
            }
            else if(dir == 2)
            {
                for(int i=right;i>=left;i--)
                    spiral.push_back(matrix[down][i]);
                down--;
            }
            else if(dir == 3)
            {
                for(int i=down;i>=top;i--)
                    spiral.push_back(matrix[i][left]);
                left++;
            }
            dir = (dir+1) % 4;
        }
        return spiral;
    }
};