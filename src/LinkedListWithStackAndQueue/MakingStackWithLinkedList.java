package LinkedListWithStackAndQueue;

public class MakingStackWithLinkedList {
    static class Node {
        int value;
        Node next;

        public Node(int x) {
            this.value = x;
            this.next = null;
        }
    }
    Node head;

    public void addToStack(int val) {
        Node node = new Node(val);
        if (head ==  null) {
            head = node;
        } else {
           node.next = head;
           head = node;
        }
    }

    public int getFromStack() {
        if(head == null) {
            return -1;
        }else {
            Node tmp = head;
            head = head.next;
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

    Node tail;
    public void addToQue(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
        }else {
            Node tmp = head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node;
        }
    }

    public int getToQue() {
        if(head == null) {
            return -1;
        }else {
            Node res = head;
            head = head.next;
            return res.value;
        }
    }
}
