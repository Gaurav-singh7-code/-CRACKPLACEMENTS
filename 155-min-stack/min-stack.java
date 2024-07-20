class MinStack {

    private Deque<Integer> stack = new ArrayDeque<>();
    private Deque<Integer> minstack = new ArrayDeque<>();

    // public MinStack() {
    //     minstack.push(Integer.MAX_VALUE);
    // }
    
    public void push(int val) {
        stack.push(val);
        if(!minstack.isEmpty()){
            minstack.push(Math.min(val, minstack.peek()));
        }else{minstack.push(Math.min(val, Integer.MAX_VALUE));}
    }
    
    public void pop() {
        stack.pop();
        minstack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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