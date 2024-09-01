package Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<Integer>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        System.out.println(stack1.peek()); // en üstteki
        System.out.println(stack1.pop()); // ateşlenen mermiyi gösterir ve 1 eksiltir
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());
        System.out.println(stack1);
    }
}
