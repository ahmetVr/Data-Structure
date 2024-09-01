package Exercise;

public class DoublyLinkedList {

    static class Node {
        int value;
        Node next;
        Node prev;
        public Node(int x) {
            this.value = x;
            next = null;
            prev = null;
        }
    }
    Node head;
    Node tail;

    public void addNode(int x) {
        Node node1 = new Node(x);
        if(this.head == null) {
            this.head = node1;
            tail = node1;
        }else {
            tail.next = node1;
            node1.prev = tail;
            tail = node1;
            tail.next = null;
        }
    }
    public void printDoubly() {
     /*   Node tmp = this.head;
        while(tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        } */
        for(Node i = this.head; i != null; i= i.next) {
            System.out.print(i.value + " ");
        }
    }
}
