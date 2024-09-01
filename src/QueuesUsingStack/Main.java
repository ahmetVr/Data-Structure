package QueuesUsingStack;

public class Main {
    public static void main(String[] args) {
        QueuesUsingStack queue1 = new QueuesUsingStack();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        queue1.add(6);
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        queue1.add(8);
        System.out.println(queue1.remove());

    }
}
