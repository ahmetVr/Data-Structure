package Exercise;

public class LinkedList {
    Node head;
    static class Node {
        int value;
        Node next;
        public Node(int x) {
            this.value = x;
            next = null;
        }
    }
    public  void insert(int data) {
        Node node1 = new Node(data);
        if(this.head == null) {
            head = node1;
        }else {
            Node tmp = this.head;
            while(tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = node1;
        }
    }

    public void printList() {
        Node tmp = this.head;
        while (tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
    }

    public void remove(int index) {
        if(this.head == null) {
            return;
        }

        Node tmp = this.head;
        for(int i = 0; tmp != null && i < index-1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }

    public void insertAddIndex(int index,int data) {
        Node node1 = new Node(data);
        Node tmp = this.head;
        for(int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }
        Node tmp2 = tmp.next;
        tmp.next = node1;
        node1.next = tmp2;
    }

    public void reverse() {
      Node next;
      Node curr = this.head;
      Node prev = null;
      while(curr != null) {
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
      }
      head = prev;
    }
    public void middleElement() {
        Node fast = this.head;
        Node slow = this.head;
        while(fast.next != null && slow != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.value);
    }
}
