package LinkedListWithStackAndQueue;

public class MakingStackAndQueueWithDooublyLinkedList {
    static class Node {
        int value;
        Node next;
        Node prev;

        public Node(int val){
            this.value = val;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    public void addToQue2(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            head.next = null;
            head.prev = null;
            tail = head;
        }else {
            head.prev = node;
            node.next = head;
            head = node;
        }
    }
    public int getToQue() {
        if(head == null) {
            return -1;
        } else {
            Node tmp = tail;
            if (tail.prev == null ) {
                head = null;
            } else  {
                tail.prev.next = null;
                tail = tail.prev;
            }
            return tmp.value;
        }
    }


    public void print() {
       Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
