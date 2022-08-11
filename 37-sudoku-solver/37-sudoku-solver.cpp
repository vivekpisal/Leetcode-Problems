class Solution {
public:
    bool can_put(vector<vector<char>>& board,int row,int col,char n){
        for(int i=0;i<board.size();i++){
            if(board[i][col] == n)
                return false;
            if(board[row][i] == n)
                return false;
        }
        int srow=(row/3)*3;
        int scol=(col/3)*3;
        for(int i=srow;i<srow+3;i++){
            for(int j=scol;j<scol+3;j++){
                if(board[i][j] == n)
                    return false;
            }
        }
        return true;
    }
    bool sudokuSolve(vector<vector<char>>& board,int row,int col){
        if(row == board.size())
            return true;
        
        int nr,nc;
        if(col == board.size()-1){
            nr=row+1;
            nc=0;
        }
        else{
            nr=row;
            nc=col+1;
        }
        
        if(board[row][col] != '.')
            return sudokuSolve(board,nr,nc);
        else
        {
            for(char no='1';no<='9';no++)
            {
                if(can_put(board,row,col,no) == true)
                {
                    board[row][col]=no;
                    if(sudokuSolve(board,nr,nc))
                        return true;
                    else
                        board[row][col]='.';
                } 
            }
        }
        return false;
    }
    void solveSudoku(vector<vector<char>>& board) {
        sudokuSolve(board,0,0);
    }
};