class Solution {
public:
    bool checkBoard(vector<vector<char>> &board,int row,int col,char p){
        for(int i=0;i<board[row].size();i++){
            if(board[row][i] == p)
                return false;
        }
        for(int i=0;i<board.size();i++){
            if(board[i][col] == p)
                return false;
        }
        
        int brow=(row/3)*3;
        int bcol=(col/3)*3;
        for(int i=brow;i<brow+3;i++){
            for(int j=bcol;j<bcol+3;j++){
                if(board[i][j] == p)
                    return false;
            }
        }
        return true;
    }
    bool sudokuSolver(vector<vector<char>> &board,int row,int col){
        if(row == board.size()){
            return true;
        }
        
        
        int nrow,ncol;
        if(col == board[0].size()-1)
        {
            nrow=row+1;
            ncol=0;
        }
        else{
            nrow=row;
            ncol=col+1;
        }
        if(board[row][col] != '.'){
            return sudokuSolver(board,nrow,ncol);
        }
        else{
            for(char p='1';p<='9';p++){
                if(checkBoard(board,row,col,p)){
                    board[row][col]=p;
                    if(sudokuSolver(board,nrow,ncol))
                        return true;
                    board[row][col]='.';
                }
            }
        }
        return false;
    }
    void solveSudoku(vector<vector<char>>& board) {
        sudokuSolver(board,0,0);
    }
};