package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList2 list1 = new DoublyLinkedList2();
        list1.addNode(1);
        list1.addNode(2);
        list1.addNode(3);
        list1.addNode(3);
        list1.addNode(5);
        list1.addNode(6);
        list1.addNode(7);
        list1.addNode(8);
        list1.printList();
        System.out.println();
        list1.removeDublicate();
        list1.printList();
        System.out.println();
        list1.insertBefore(1,28);
        list1.printList();
        System.out.println();
        list1.insertAfter(4,59);
        list1.printList();
    }

}
