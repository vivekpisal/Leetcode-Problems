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
    bool sudokuSolve(vector<vector<char>>& board){
        for(int i=0;i<board.size();i++)
        {
            for(int j=0;j<board[i].size();j++)
            {
                if(board[i][j] == '.')
                {
                    for(char no='1';no<='9';no++)
                    {
                        if(can_put(board,i,j,no))
                        {
                            board[i][j]=no;
                            if(sudokuSolve(board))
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    void solveSudoku(vector<vector<char>>& board) {
        sudokuSolve(board);
    }
};