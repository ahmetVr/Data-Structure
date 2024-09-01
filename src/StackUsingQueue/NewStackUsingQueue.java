package StackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class NewStackUsingQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public NewStackUsingQueue() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }

    public void push(int item) {
        queue1.add(item);
    }

    public void pop() { // 1 2 3 4 5
        while(queue1.size() > 1) {
            queue2.add(queue1.remove());
        }
        while(queue2.size() > 0) {
            queue1.add(queue2.remove());
        }
        queue1.remove();

    }
}
