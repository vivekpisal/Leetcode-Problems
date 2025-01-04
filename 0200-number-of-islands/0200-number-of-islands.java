class Solution {
    private static class Pair{
        int i,j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int numIslands(char[][] grid) {
        if(grid.length == 0) return 0;
        int n=grid.length,m=grid[0].length;
        int next[] = {1,-1};
        int numOfislands=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    Queue<Pair> queue = new LinkedList<>();
                    queue.offer(new Pair(i,j));
                    numOfislands++;
                    while(!queue.isEmpty()){
                        int row=queue.element().i;
                        int col=queue.element().j;
                        queue.poll();
                        grid[row][col] = '2';
                        for(int k=0;k<next.length;k++){
                            int nextRow = row + next[k];
                            int nextCol = col + next[k];
                            if(nextRow >= 0 && nextRow < n && grid[nextRow][col] == '1'){
                                queue.add(new Pair(nextRow,col));
                                grid[nextRow][col] = '2';
                            }
                            if(nextCol >= 0 && nextCol < m && grid[row][nextCol] == '1'){
                                queue.add(new Pair(row,nextCol));
                                grid[row][nextCol] = '2';
                            }
                        }
                    }
                }
            }
        }
        return numOfislands;
    }
}