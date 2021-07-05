class MyQueue {
public:
    /** Initialize your data structure here. */
    stack<int> st1,st2;
    MyQueue() {
        
    }
    
    /** Push element x to the back of queue. */
    void push(int x) {
        st1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    int pop() {
        while(!st1.empty())
        {
            st2.push(st1.top());
            st1.pop();
        }
        int topele = st2.top();
        st2.pop();
        while(!st2.empty())
        {
            st1.push(st2.top());
            st2.pop();
        }
        return topele;
    }
    
    /** Get the front element. */
    int peek() {
        while(!st1.empty())
        {
            st2.push(st1.top());
            st1.pop();
        }
        int peekele = st2.top();
        while(!st2.empty())
        {
            st1.push(st2.top());
            st2.pop();
        }
        return peekele;
    }
    
    /** Returns whether the queue is empty. */
    bool empty() {
        return st1.empty();
    }
};

