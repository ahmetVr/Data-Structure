package TIH.FirstDay;

public class MergeTwoSortedList {
    Node head;

    static class Node {
        int value;
        Node next;

        public Node(int x) {
            value = x;
            next = null;
        }
    }

    public void addNode(int val) {
        Node node1 = new Node(val);
        if(head == null) {
            this.head = node1;
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
        while(tmp != null) {
            System.out.println(tmp.value + " ");
            tmp = tmp.next;
        }
    }

    public static MergeTwoSortedList mergeTwoList(MergeTwoSortedList list1, MergeTwoSortedList list2) {
        MergeTwoSortedList answerList = new MergeTwoSortedList();
        Node pointer1 = list1.head;
        Node pointer2 = list2.head;
        Node tmp = answerList.head;

        while(pointer1 != null && pointer2 != null) {
            if(pointer1.value < pointer2.value) {
                tmp.next = pointer1;
                pointer1 =pointer1.next;
            }else {
                tmp.next = pointer2;
                pointer2 = pointer2.next;
            }
            tmp = tmp.next;
        }

        while(pointer1 != null) {
            tmp.next = pointer1;
            pointer1 = pointer1.next;
            tmp = tmp.next;
        }
        while(pointer2 != null) {
            tmp.next = pointer2;
            pointer2 = pointer2.next;
            tmp = tmp.next;
        }
        return answerList;
    }

    public static void main(String[] args) {
        MergeTwoSortedList list1 = new MergeTwoSortedList();
        list1.addNode(1);
        list1.addNode(23);
        list1.addNode(4);
        list1.addNode(34);
        list1.addNode(99);
        MergeTwoSortedList list2 = new MergeTwoSortedList();
        list2.addNode(1);
        list2.addNode(56);
        list2.addNode(88);
        list2.addNode(3);
        list2.addNode(4);
        list1.printList();
        MergeTwoSortedList result = new MergeTwoSortedList();
        Node tmp = mergeTwoList(list1,list2).head;
        while(tmp != null) {
            System.out.println(tmp.value + " ");
            tmp = tmp.next;
        }



    }

}
