package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList2 list = new LinkedList2();
        LinkedList2 list2 = new LinkedList2();
       list.insert(1);
       list.insert(2);
       list.insert(3);
       list.insert(4);
       list.printList();
       list.insertAddIndex(0,8);
        System.out.println();
        list.printList();
    }
}
