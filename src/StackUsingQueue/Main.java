package StackUsingQueue;

public class Main {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
