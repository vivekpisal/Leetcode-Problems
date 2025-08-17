class Solution {
    private void dfs(char[][] board,int[][] visited,int x,int y){
        if(x < 0 || x >= board.length || y < 0 || y >= board[0].length)
            return;

        int coordinates[] = {0,1,0,-1,0};
        visited[x][y]=1;
        for(int i=0;i<4;i++){
            int xRow = x + coordinates[i];
            int yCol = y + coordinates[i+1];
            if(xRow >=0 && xRow < board.length && yCol >= 0 && yCol < board[0].length && board[xRow][yCol] == 'O' && visited[xRow][yCol] == 0)
                dfs(board,visited,xRow,yCol);
        }
    }
    public void solve(char[][] board) {
        int n = board.length,m = board[0].length;
        int[][] visited = new int[n][m];
        for(int i=0;i<n;i++){
            if(board[i][0] == 'O' && visited[i][0] == 0){
                dfs(board,visited,i,0);
            }
            if(board[i][m-1] == 'O' && visited[i][m-1] == 0){
                dfs(board,visited,i,m-1);
            }
        }
        for(int j=0;j<m;j++){
            if(board[0][j] == 'O' && visited[0][j] == 0){
                dfs(board,visited,0,j);
            }
            if(board[n-1][j] == 'O' && visited[n-1][j] == 0){
                dfs(board,visited,n-1,j);
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] == 'O' && visited[i][j] == 0){
                    board[i][j] = 'X';
                }
            }
        }
    }
}