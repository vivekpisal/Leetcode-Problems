class Solution {
public:
    bool isSafe(vector<string> &board,int row,int col){
        int i=row,j=col;
        while(i >= 0){
            if(board[i][j] == 'Q')
                return false;
            i--;
        }
        i=row;
        while(i >= 0 && j >= 0){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        i=row,j=col;
        while(i >= 0  && j <= board[0].size()){
            if(board[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
    void nqueen(vector<vector<string>> &nQueen,vector<string>& board,int i,int n){
        if(i == n){
            nQueen.push_back(board);
            return;
        }
        
        for(int col=0;col<board.size();col++){
            if(isSafe(board,i,col)){
                board[i][col]='Q';
                nqueen(nQueen,board,i+1,n);
                board[i][col]='.';
            }
        }
    }
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> nQueen;
        string str(n,'.');
        vector<string> board(n,str);
        nqueen(nQueen,board,0,n);
        return nQueen;
    }
};