class Solution {
    public boolean wordSearch(char[][] board,boolean[][] visited,String word,int i,int x,int y){
        if(i == word.length()) return true;

        if(x >= board.length || x < 0 || y >= board[0].length || y < 0 || visited[x][y] == true || word.charAt(i) != board[x][y])
            return false;

        visited[x][y] = true;
        boolean loc = wordSearch(board,visited,word,i+1,x-1,y) ||
        wordSearch(board,visited,word,i+1,x+1,y) ||
        wordSearch(board,visited,word,i+1,x,y-1) ||
        wordSearch(board,visited,word,i+1,x,y+1);
        visited[x][y] = false;
        return loc;
    }
    public boolean exist(char[][] board, String word) {
        boolean[][] visited  = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(wordSearch(board,visited,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }
}