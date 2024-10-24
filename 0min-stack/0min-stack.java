class MinStack {
    
    class Pair{
        int value;
        int min;
        
        public Pair(int min,int value){
            this.min = min;
            this.value = value;
        }
    }
    
    Stack<Pair> stack;
    

    public MinStack() {
        this.stack = new Stack<Pair>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            Pair pair = new Pair(val,val);
            stack.push(pair);
        }
        else{
            Pair p = stack.peek();
            if(val > p.min){
                Pair pair = new Pair(p.min,val);
                stack.push(pair);
            }
            else{
                Pair pair = new Pair(val,val);
                stack.push(pair);
            }
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().value;
    }
    
    public int getMin() {
        return stack.peek().min;
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