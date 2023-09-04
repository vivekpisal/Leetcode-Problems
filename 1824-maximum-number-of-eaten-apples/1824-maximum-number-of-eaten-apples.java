class Solution {
    class Pair{
        int i,j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }
    }
    public int eatenApples(int[] apples, int[] days) {
        Queue<Pair> minH = new PriorityQueue<Pair>((p,q)->p.j-q.j);
        int daysEaten=0;
        for(int i=0;i<apples.length || !minH.isEmpty();i++){
            if(i < apples.length && apples[i] != 0){
                minH.offer(new Pair(apples[i],days[i]+i));
            }
            while(minH.peek() != null && minH.peek().j <= i)minH.poll();
            Pair p = minH.poll();
            if(p!=null){
                daysEaten++;
                p.i--;
                if(p.i > 0){
                    minH.offer(p);
                }
            }
        }
        return daysEaten;
    }
}