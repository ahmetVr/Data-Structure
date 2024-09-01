package Reminder;

public class LinkedList {
    Node head;
    static class Node {
        Node next;
        int value;
        public Node(int x) {
            this.value = x;
        }
    }

    public void addNode(int value) {
        Node node1 = new Node(value);
        if(head == null) {
            head = node1;
        }
        Node tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node1;
    }

    public int findMiddleElement() {
        if (head == null) {
            return -1;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow.value;
    }

}
