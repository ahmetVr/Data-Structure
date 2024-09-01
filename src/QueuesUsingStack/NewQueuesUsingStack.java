package QueuesUsingStack;

import java.util.Stack;

public class NewQueuesUsingStack {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void add(int item) { // 5 4 3 2 1
        stack1.push(item);
    }

    public int  remove() { // pop methodunu kullan
        while(stack1.size() > 1) {
            stack2.push(stack1.pop());
        }

        int tmp = stack1.pop();
        while(stack2.size() > 0) {
            stack1.push(stack2.pop());
        }
        return tmp;
    }

}
