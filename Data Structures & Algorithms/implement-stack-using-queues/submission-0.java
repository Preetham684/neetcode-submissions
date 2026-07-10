class MyStack {
    Queue<Integer> q1;
    // Queue<Integer> q2;
    int size;

    // Just one queue
    public MyStack() {
        q1 = new LinkedList(); // Because Queue is an interface
        // q2 = new LinkedList();
        size = q1.size();

    }

    // push would behave the same as a queue
    public void push(int x) {
        q1.add(x);

        // reverse the elements in that queue
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.poll());
        }
    }

    // Queue pops the first one out, Stack pops the last one out
    public int pop() {
        // 2<-3<-1<-5
        // 2 comes out first in a queue
        // 5 comes out first in a stack
        return q1.poll();
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
