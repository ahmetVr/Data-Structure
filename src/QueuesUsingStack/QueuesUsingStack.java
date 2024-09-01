package QueuesUsingStack;

import java.util.Stack;

public class QueuesUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueuesUsingStack() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void add(int item) { // 1 2 3 4 5
        stack1.push(item);
    }

    public int remove() {
        while(stack1.size() > 1) {
            stack2.push(stack1.pop()); // 5 4 3 2
        }
        int tmp = stack1.pop();// 1
        while(stack2.size() > 0) { // 5 4 3 2
            stack1.push(stack2.pop());// 2 3 4 5
        }
        return tmp; 
    }
}
