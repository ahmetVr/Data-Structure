package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        LinkedList2 list2 = new LinkedList2();

       list.insert(3);

       list.insert(5);
       list.printList();
       System.out.println();
       list.reverseStop(list.head,1);
       list.printList();

    }
}
