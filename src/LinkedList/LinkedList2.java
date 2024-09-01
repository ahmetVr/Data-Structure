package LinkedList;

public class LinkedList2 {
    Node head;
    static class Node {
        int value;
        Node next;

        public Node(int x) {
            value = x;
            next = null;
        }
    }

    public void  insert(int data) {
        Node node1 = new Node(data);

        if (this.head==null) {
            this.head =node1;
        } else {
            Node tmp = this.head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = node1;
        }
    }

    public void remove(int index) {
        if(this.head == null) {
            return;
        }
        Node tmp = this.head;
        for(int i = 0; tmp != null && i < index-1 ; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
    }

    public void printList() {
        Node tmp = this.head;
        while(tmp != null) {
            System.out.print(tmp.value + " ");
            tmp = tmp.next;
        }
    }

    public void insertAddIndex(int index,int data) {
        Node node1 = new Node(data);
        Node tmp = this.head;
        for (int i = 0; i < index-1; i++) {
            tmp = tmp.next;
        }
        Node tmp2 = tmp.next;
        tmp.next = node1;
        node1.next = tmp2;
    }
    public void mergeTwoLists(LinkedList2 list2) { // list1 = [1,2,4], list2 = [1,3,4]
        Node tmp = this.head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        Node tmp2 = list2.head;
        tmp.next = tmp2;
    }

     // QUESTIONS
    public void reverse() {
        Node prev = null;
        Node curr = this.head;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        this.head = prev;
    }

    public int middleElement() {
        Node tmp = this.head;
        int count = 1;
        while(tmp != null) {
            tmp = tmp.next;
            count++;
        }
        Node tmp2 = this.head;
       for(int i = 0; i < (count/2)-1; i++) {
           tmp2 = tmp2.next;
       }
        return tmp2.value;
    }

    public Node mıddleNode(){
        Node slow = head;
        Node fast = head;

        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    // 1-2-3-3-4-5
    // 1-2-3-4-5
    public void removeDuplicate() {
        Node tmp = this.head;
        while(tmp != null && tmp.next != null) {
            if(tmp.value == tmp.next.value) {
                tmp.next = tmp.next.next;
            }else {
                tmp = tmp.next;
            }
        }
    }
    // 1-2-3-4-5
    // [1,2,3,4,5]

    public boolean isPalindrome() {
     return true;
    }
}
