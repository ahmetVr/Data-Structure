package DoublyLinkedList;

public class DoublyLinkedList2 {

    static class Node {
        int value;
        Node next;
        Node prev;
        public Node(int x) {
            this.value = x;
            this.next= null;
            this.prev = null;
        }
    }
    Node head;
    Node tail;

    public void addNode(int data) {
        Node node1 = new Node(data);
        if(head == null) {
            head = node1;
            tail = node1;
        }else {
            tail.next = node1;
            node1.prev = tail;

            tail = node1;
            tail.next = null;
        }
    }
    public void printList() {
        for(Node i = head; i != tail.next; i = i.next) {
            System.out.print(i.value + " ");
        }
    }

    public void remove(int value) {
        Node tmp = head;
        while(tmp != tail.next) {
            if(tmp.value == value) {
                Node tmp2 = tmp;
                boolean flag = true;
                while (tmp2.value == tmp.next.value) {
                    flag = false;
                    tmp2 = tmp2.next;
                }
                if (flag) {
                    tmp2 = tmp2.next;
                }

                if(tmp.prev != null) {
                    tmp.prev.next = tmp2;
                }else{
                    head = tmp.next;
                }
                if(tmp.next != null) {
                    tmp2.prev = tmp.prev;
                }else {
                    tail = tmp.prev;
                }
            }
            tmp = tmp.next;
        }
    }
    public void insertAfter(int index,int data) { // 1-2-3-(8)-4-5
        Node node1 = new Node(data);
        Node tmp = head;
        for(int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        Node tmp2 = tmp.next;
        tmp2.prev.next = node1;
        node1.next = tmp2;
        tmp2.prev = node1;
        node1.prev = tmp;
    }

    public void insertBefore(int data1,int data2) {
        Node node1 = new Node(data2);
        Node tmp = head;
        while(tmp != null) {
            if(tmp.value == data1) {
                if(tmp.prev != null) {
              /*    Node tmp2 = tmp.prev;
                    tmp.prev = node1;
                    node1.prev = tmp2;
                    tmp2.next = node1;
                    node1.next = tmp; */
                    Node tmp2 = tmp.prev;
                    tmp.prev.next = node1;
                    node1.prev = tmp2;
                    node1.next = tmp;
                } else {
                    node1.next = head;
                    head.prev = node1;
                    head = node1;
                }
            }
            tmp = tmp.next;
        }
    }
    public void removeDublicate() {
        Node tmp = head;
        while(tmp != null && tmp.next != null) {
            if(tmp.value == tmp.next.value) {
                Node tmp3 = tmp.next.next;
                tmp3.prev = tmp.prev;
                tmp.prev.next = tmp3;
                tmp = tmp3;
            }
            tmp = tmp.next;
        }
    }
}



