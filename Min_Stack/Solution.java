

                      // LeetCode Problem: Min Stack - 155 no. problem

import java.util.Stack;
public class Solution {
    class MinStack {
    private Stack<Integer> st;
    private Stack<Integer>minst;

    public MinStack() {
        st=new Stack<>();
        minst= new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minst.isEmpty() || val<=minst.peek()){
            minst.push(val);
        }
    }
    
    public void pop() {
        int remove=st.pop();
        if(remove==minst.peek()){
            minst.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
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
}
