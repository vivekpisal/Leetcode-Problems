class Solution {
    private static class Pair{
        int ele,loc;
        public Pair(int ele,int loc){
            this.ele = ele;
            this.loc = loc;
        }
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair> stack = new Stack<>();
        int nextWarmerTemp[] = new int[temperatures.length];
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.empty() && temperatures[i] >= stack.peek().ele){
                stack.pop();
            }

            if(stack.empty())  nextWarmerTemp[i] = 0;
            else nextWarmerTemp[i] = stack.peek().loc - i;

            stack.push(new Pair(temperatures[i],i));
        }
        return nextWarmerTemp;
    }
}