class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
        vector<vector<int>> mat(n,vector<int>(n,0));
        int dir=0;
        int top=0,down=n-1,left=0,right=n-1;
        int count=1;
        while(left <= right && top <= down)
        {
            if(dir == 0)
            {
                for(int i=left;i<=right;i++,count++)
                {
                    mat[top][i]=count;
                }
                top++;
            }
            else if(dir == 1)
            {
                for(int i=top;i<=down;i++,count++)
                {
                    mat[i][right]=count;
                }
                right--;
            }
            else if(dir == 2)
            {
                for(int i=right;i>=left;i--,count++)
                {
                    mat[down][i]=count;
                }
                down--;
            }
            else if(dir == 3)
            {
                for(int i=down;i>=top;i--,count++)
                {
                    mat[i][left]=count;
                }
                left++;
            }
            dir=(dir+1)%4;
        }
        return mat;
    }
};