package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue1 = new LinkedList<String>();
        queue1.add("Kerem");
        queue1.add("Ahmet");
        queue1.add("Selim");
        queue1.add("Emir");
        System.out.println(queue1);
        System.out.println(queue1.peek());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.isEmpty());

    }


}
