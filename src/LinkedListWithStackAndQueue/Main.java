package LinkedListWithStackAndQueue;

public class Main {
    public static void main(String[] args) {
      MakingStackAndQueueWithDooublyLinkedList que = new MakingStackAndQueueWithDooublyLinkedList();
      que.addToQue2(1);
      que.addToQue2(2);
      que.addToQue2(3);
      que.addToQue2(4);
      que.addToQue2(5);
      que.print();
      System.out.println("--------------");
      System.out.println(que.getToQue());
      System.out.println(que.getToQue());
      System.out.println(que.getToQue());
      que.print();


    }
}
