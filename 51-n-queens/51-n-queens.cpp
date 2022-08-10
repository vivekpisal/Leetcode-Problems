class Solution {
public:
    bool isSafe(int row,int col,vector<string>&board,int n){
        int j=col;
        while(j >= 0){
            if(board[row][j] == 'Q')
                return false;
            j--;
        }
        int i=row;
        j=col;
        while(i < n && j >= 0){
            if(board[i][j] == 'Q')
                return false;
            i++;
            j--;
        }
        i=row;
        j=col;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        return true;
    }
    void n_queen(vector<string> &board,vector<vector<string>>& ans,int col,int n){
        if(col == n){
            ans.push_back(board);
            return;
        }
        
        for(int row=0;row<n;row++){
            if(isSafe(row,col,board,n)){
                board[row][col]='Q';
                n_queen(board,ans,col+1,n);
                board[row][col]='.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> ans;
        vector<string> board(n);
        string str(n,'.');
        for(int i=0;i<n;i++){
            board[i]=str;
        }
        n_queen(board,ans,0,n);
        return ans;
    }
};