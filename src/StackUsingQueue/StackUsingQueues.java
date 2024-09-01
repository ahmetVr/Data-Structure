package StackUsingQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    public StackUsingQueues() {
        queue1 = new LinkedList<Integer>();
        queue2 = new LinkedList<Integer>();
    }
    public void push(int item) {
        queue1.add(item);

    }
    /*
      Queue1 = [Mehmet]

     s.pop() -> Mehmet

     Queue2 = [Kerem, Ahmet]
     quue1.remove() -> Mehmet
     */
    public int pop() {  // 1 2 3 4 5
        while(queue1.size() > 1) {
            queue2.add(queue1.remove()); // 1 2 3 4
        }
        while(queue2.size() > 0) {
            queue1.add(queue2.remove()); //
        }
        return queue1.remove(); // 5
    }
}
