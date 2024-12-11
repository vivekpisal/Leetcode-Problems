class MinStack {
    
    private List<Integer> stack;
    private int size;
    public MinStack() {
        stack = new ArrayList<>();
        size = 0;
    }
    
    public void push(int val) {
        stack.add(val);
        size++;
    }
    
    public void pop() {
        stack.remove(size-1);
        size--;
    }
    
    public int top() {
        return stack.get(size-1);
    }
    
    public int getMin() {
        return Collections.min(stack);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */