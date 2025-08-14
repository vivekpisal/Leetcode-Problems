class Pair{
    int i,j;

    public Pair(int i,int j){
        this.i = i;
        this.j = j;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int numOfIsland = 0;
        Queue<Pair> queue = new LinkedList<>();
        int n = grid.length,m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    queue.offer(new Pair(i,j));
                    grid[i][j] = '2';
                    while(!queue.isEmpty()){
                        Pair p = queue.poll();
                        int x = p.i,y = p.j;
                        if(x-1 >= 0 && grid[x-1][y] == '1'){
                            grid[x-1][y] = '2';
                            queue.offer(new Pair(x-1,y));
                        }
                        if(x+1 < n && grid[x+1][y] == '1'){
                            grid[x+1][y] = '2';
                            queue.offer(new Pair(x+1,y));
                        }
                        if(y-1 >= 0 && grid[x][y-1] == '1'){
                            grid[x][y-1] = '2';
                            queue.offer(new Pair(x,y-1));
                        }
                        if(y+1 < m && grid[x][y+1] == '1'){
                            grid[x][y+1] = '2';
                            queue.offer(new Pair(x,y+1));
                        }
                    }
                    numOfIsland++;
                }
            }
        }
        return numOfIsland;
    }
}